public class largestnumbers {

    public static int getlargest(int agrim[]) {
        int large = Integer.MIN_VALUE;
        int smaller = Integer.MAX_VALUE;
        for (int i = 0; i < agrim.length; i++) {
            if (large < agrim[i]) {
                large = agrim[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        // We have to use the largest value then we must count from - infinity
        // we use smallest value then we must count from + infinity.
        int agrim[] = { 10, 11, 121, 1421, 23, 0, 9009, 901, 11101 };
        System.out.print("Print largest number : " + getlargest(agrim));

    }
}