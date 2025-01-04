import java.util.*;

public class priorityqueues {
    public static void main(String[] args) {
        Queue<String> st = new PriorityQueue<>(Comparator.reverseOrder());
        st.offer("AB");
        st.offer("ABC");
        st.offer("ABCD");
        st.offer("ABCDE");
        st.offer("ABCDEF");
        st.offer("ABCDEFG");
        st.offer("ABCDEFGH");
        st.offer("ABCDEFGHI");
        System.out.println(st);

        System.out.println(st.peek());
    }
}
