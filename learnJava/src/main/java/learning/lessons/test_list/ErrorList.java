package main.java.learning.lessons.test_list;

import java.util.Arrays;
import java.util.List;

public class ErrorList {

    public List<Error> getListErrors() {
        return Arrays.asList(
                new Error("ERROR - 440", 4),
                new Error("ERROR - 223", 2),
                new Error("ERROR - 500", 5),
                new Error("ERROR - 501", 5),
                new Error("ERROR - 100", 1),
                new Error("ERROR - 304", 3)
        );
    }
}
