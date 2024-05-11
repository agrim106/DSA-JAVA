public class Butterlfy {
    public static void butterfly(int n) {
        // 1st half of the pattern
        for (int i = 1; i <= n; i++) {
            // Now the stars(i) will get printed
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Now the spaces will get printed.
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * This concludes the first half of the pattern now remember the 2nd half is the
         * mirror image of the code.
         */
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // Now the stars(i) will get printed
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Now the spaces will get printed.
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(8);
    }/* Nicely Done. now I will be writing the code in notebook. */
}
