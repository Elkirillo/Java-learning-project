package main.java.learning.lessons.collections.list;

import java.util.*;

/**
 * also include iterator example
**/

public class ListExamples {


    public static String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }

    public static void main(String[] args) throws Exception{

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3);
        Collection<Integer> integerCollection = new ArrayList<>();
        for (Integer lis : list) {
            System.out.println(lis);
        }
        System.out.println(process("Gribolda best russian rapper"));
        ListExamples ex1 = new ListExamples();
        List<Snow> snow1 = Arrays.asList(ex1.new Light(), ex1.new Heavy());
        List<Snow> snow2 = Arrays.<Snow>asList(ex1.new Heavy(), ex1.new Crustly());
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.addAll(0, integerList);

        //iterator example
        integerList.iterator();
        System.out.println("iter1 = " + integerList.iterator().next());
        for (Integer lis1 : integerList) {
            System.out.println(lis1);
        }

        Iterator<Integer> iterator = integerList.iterator();

        while(iterator.hasNext()) {
            System.out.println("iterator value = " + iterator.next());
        }

        Object[][] fields = new Object[3][3];
        for (int i = 0; i < 3; i++)
            fields[i] = new Object[] {"123"+i, "456"+i};
        for (Object[] std : fields) {
            System.out.println(std.toString());
        }
        while (true) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("in cach block");
                break;
            }
            finally {
                System.out.println("in finaly block");
            }
        }

        List<? super RuntimeException> list1 = new ArrayList<>();
        list1.add(new NullPointerException());
       // list1.add(new InterruptedException());
        list1.add(new ArithmeticException());

    }

    class Snow{}
    class Powder extends Snow {}
    class Light extends Powder {}
    class Heavy extends Powder {}
    class Crustly extends Snow {}

}
