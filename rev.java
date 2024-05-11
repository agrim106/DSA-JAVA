public class rev {
    public static void reverse(int[] m) {
        int first = 0;
        int last = m.length - 1;
        while (first < last) {
            int swap = m[last];
            m[last] = m[first];
            m[first] = swap;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int m[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }

}
