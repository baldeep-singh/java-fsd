package PracticeProject3;

import java.util.Stack;

public class Problem8 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(5);

        System.out.println("Stack elements after pushing:");
        System.out.println(stack);

        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        System.out.println("Stack elements after popping:");
        System.out.println(stack);
    }
}
