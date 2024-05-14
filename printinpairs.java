public class printinpairs {
    public static void pairs(int agrim[]) {
        for (int i = 0; i < agrim.length; i++) {
            int curr = agrim[i];
            for (int j = i + 1; j < agrim.length; j++) {
                System.out.println("(" + curr + "," + agrim[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int agrim[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        pairs(agrim);
    }
}
