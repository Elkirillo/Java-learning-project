package main.java.learning.lessons.leetcode;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/add-two-numbers/ */
public class TestSolution {

    public static void main (String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode a = new ListNode(),
                b = new ListNode();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        addTwoNumbers(l1, l2);
    }

     static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //System.out.println(l1.val + " " + " " + l1.next.val + " " + l1.next.next.val);
         List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         list2.add(l2.val);
         list1.add(l1.val);
         while (l1.next != null){
             l1 = l1.next;
             list1.add(l1.val);
         }
         while (l2.next != null){
             l2 = l2.next;
             list2.add(l2.val);
         }
         int num1 = 0;
         int num2 = 0;
         for (int i = list1.size() - 1 ; i >= 0; i --) {
             num1 = list1.get(i) + num1*10;
         }
         for (int i = list2.size() - 1 ; i >= 0; i --) {
             num2 = list2.get(i) + num2*10;
         }
         int num3 = num2 + num1;
         List<Integer> list3 = new ArrayList<>();
         while (num3 != 0) {
             list3.add(num3 % 10);
             num3 /= 10;
         }
         ListNode l3 = new ListNode();
         ListNode buf;
         buf = l3;
         for (int nms : list3) {
             l3.val = nms;
             if (nms != list3.get(list3.size()-1))
                l3.next = new ListNode();
             l3 = l3.next;
         }
         return buf;
    }


}


/* https://leetcode.com/problems/add-two-numbers/ */