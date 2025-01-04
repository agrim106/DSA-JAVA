import java.util.*;

public class priorityquwuw {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(13);
        pq.offer(111);
        pq.offer(122);
        pq.offer(18);
        pq.offer(10);
        pq.offer(145);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
