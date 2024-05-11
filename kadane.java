public class kadane {
    public static void kadanes(int agrim[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < agrim.length; i++) {
            cs = cs + agrim[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int agrim[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(agrim);
    }
}
