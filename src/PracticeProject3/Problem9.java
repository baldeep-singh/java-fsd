package PracticeProject3;
import java.util.LinkedList;
import java.util.Queue;

public class Problem9 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(7);
        queue.add(5);

        System.out.println("Queue elements after adding:");
        System.out.println(queue);

        System.out.println("Element at the front of the queue: " + queue.peek());

        queue.remove();
        System.out.println("Queue elements after removing:");
        System.out.println(queue);
    }
}
