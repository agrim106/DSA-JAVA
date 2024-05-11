public class dimond {
    // Method to print diamond pattern
    public static void diamondPattern(int n) {
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Spaces before stars
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Spaces before stars
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(5);
    }
}
