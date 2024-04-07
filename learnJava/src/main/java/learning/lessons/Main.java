package main.java.learning.lessons;

import main.java.learning.lessons.test_list.ErrorList;
import main.java.learning.lessons.test_list.ListExample;
import main.java.learning.lessons.test_list.Error;
import main.java.learning.lessons.leetcode.TestBook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ObjectMapper objectMapper = new ObjectMapper();
        //ResultPOJO resultPOJO = new ResultPOJO("123", "Valaev");
        ListExample listExample = new ListExample();
        listExample.addList();
        listExample.getList();
        System.out.println("Hello world!");

        List<String> errorFromServer = Arrays.asList("ERROR - 440", "INTERNAL ERROR - 440", "ERROR - 501");

        ErrorList errorList = new ErrorList();
        List<Error> errors = errorList.getListErrors();

        Error highestPriorityError = getHighPriorityError(errors, errorFromServer);
        System.out.println("Highest priority: " + highestPriorityError);

        //validateResult(highestPriorityError);
    }

    public static Error getHighPriorityError(List<Error> errors, List<String> errorFromServer) {
        List<Error> sortedErrors = errors.stream().sorted(Comparator.comparingInt(Error::getPriority)).filter(x -> {
            for (String ers: errorFromServer) {
                if (x.getCode().equals(ers))
                    return true;
            }
            return false;
        }).toList();

        for (Error error : sortedErrors) {
            System.out.println(error);
        }
        TestBook tb = new TestBook();
        return sortedErrors.get(0);
    }
}