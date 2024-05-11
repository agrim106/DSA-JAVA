public class Kadanealgo {
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
        System.out.println("Maximum subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int agrim[] = { -2, -5, 10, 8, -9, -1, 6, -3, 7 };
        kadanes(agrim);
    }
}
