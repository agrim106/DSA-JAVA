public class printsubarrays {

    public static void subarrays(int agrim[]) {
        int ts = 0;
        for (int i = 0; i < agrim.length; i++) {
            int start = i;
            for (int j = i; j < agrim.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(agrim[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + ts);
    }

    public static void main(String[] args) {
        int agrim[] = { 2, 4, 6, 8, 10 };
        subarrays(agrim);
    }
}