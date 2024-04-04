package main.java.learning.lessons.test_list;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExample {
    private List<String> listcont = new ArrayList<>();
    public void addList () {
        listcont.add("my name is");
        listcont.add("Gribovik");
        listcont.add(1, "Not is");
        listcont.set(0, "your name");
        List<String> newList = getList();
        printList(newList);
    }

    public List<String> getList() {
        List<String> list = new ArrayList<>();
        for (String listcon : listcont) {
            list.add(listcon);
        }
        return list;
    }

    public void printList(List<String> lists) {
        for (String list : lists) {
            System.out.println(list);
        }
    }


}
