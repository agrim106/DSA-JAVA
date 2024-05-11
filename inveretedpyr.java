public class inveretedpyr {
    public static void invertedpyramid(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // New code print inverted halpyramid with numbers
    public static void withnumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; (int) j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // invertedpyramid(5);
        withnumbers(8);
    }
}
