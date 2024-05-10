package main.java.learning.lessons.collections.stack;

public class StackTest {
    public static void main (String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog hase fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
