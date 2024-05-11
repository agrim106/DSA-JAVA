import java.util.*;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /* We are making ternary operator with this code. */
        String check = (a > b) ? "A is greater than b" : "B is greater than A";
        System.out.println(check);
        sc.close();
    }
}