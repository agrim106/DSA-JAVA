import java.util.*;

public class factorial {
    /* We are writing a code for calculating a factorial for a number */
    public static int agrim(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The result of the function called is : " + agrim(n));
        sc.close();
    }
}
