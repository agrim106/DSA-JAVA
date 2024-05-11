import java.util.*;

public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of line you want to print");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(" " + num);
            }
            System.err.println();
        }
        sc.close();
    }
}