package main.java.learning.lessons;

import java.util.*;

public class ExaplesFilosofia implements Interface2{
    public static String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }

    private int a1;
    public static void main(String[] args) {
        Interface1 int1 = new Interface1() {
            @Override
            public void sex() {
                ExaplesFilosofia ef = new ExaplesFilosofia();
                System.out.println(ef.a1);
            }
        };
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3);
        Collection<Integer> integerCollection = new ArrayList<>();
        for (Integer lis : list) {
            System.out.println(lis);
        }
        System.out.println(process("Gribolda best russian rapper"));
        ExaplesFilosofia ex1 = new ExaplesFilosofia();
        List<Snow> snow1 = Arrays.asList(ex1.new Light(), ex1.new Heavy());
        List<Snow> snow2 = Arrays.<Snow>asList(ex1.new Heavy(), ex1.new Crustly());
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(0, integerList);
        integerList.iterator();
        System.out.println("iter1 = " + integerList.iterator().next());
        for (Integer lis1 : integerList) {
            System.out.println(lis1);
        }
        Iterator<Integer> iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println("iterator value = " + iterator.next());
        }

    }

    @Override
    public void sex() {

    }

    @Override
    public void sex2() {

    }

    @Override
    public String sex3() {
        return null;
    }

    class Snow{}
    class Powder extends Snow{}
    class Light extends  Powder {}
    class Heavy extends  Powder {}
    class Crustly extends Snow {}
}
