package main.java.learning.lessons;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import main.java.learning.lessons.test_list.ListExample;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        ResultPOJO resultPOJO = new ResultPOJO("123", "Valaev");
        ListExample listExample = new ListExample();
        listExample.addList();
        listExample.getList();
        System.out.println("Hello world!");
    }
}