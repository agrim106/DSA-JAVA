import java.util.*;

public class clcdek {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(11);
        adq.offer(10);
        adq.offer(19);
        adq.offerFirst(23);
        adq.offerLast(21);
        System.out.println(adq);
        System.out.println(adq.peek());
    }
}
