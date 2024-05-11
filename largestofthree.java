import java.util.*;

public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is the greatest of three");
        }
        if (b > a && b > c) {
            System.out.println("B is greatest of three");
        } else {
            System.out.println("C is the greatest");
        }
        sc.close();
    }
}
