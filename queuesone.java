import java.util.*;

public class queuesone {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(19);
        queue.offer(32);
        queue.offer(11);
        queue.offer(23);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
