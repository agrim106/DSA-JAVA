public class binarytrinalgle {
    public static void binarytriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Now for inner loop
            for (int j = 1; j <= i; j++) {
                // This is for each cell now
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        binarytriangle(7);
    }
}
