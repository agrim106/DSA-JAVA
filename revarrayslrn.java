public class revarrayslrn {
    public static void revsarr(int agrimsarr[]) {
        int st = 0;
        int end = agrimsarr.length - 1;
        while (st < end) {
            int temp = agrimsarr[end];
            // int swap = m[last];
            // m[last] = m[first];
            // m[first] = swap;
            // first++;
            // last--;
            agrimsarr[end] = agrimsarr[st];
            agrimsarr[st] = temp;
            st++;
            end--;

        }
    }

    public static void main(String[] args) {
        int agrimsarr[] = { 10, 23, 32, 43, 234, 4365, 65464, 2092, 23432, 2234324 };
        revsarr(agrimsarr);
        for (int i = 0; i < agrimsarr.length; i++) {
            System.out.print(agrimsarr[i] + " ");
        }
        System.out.println();

    }
}