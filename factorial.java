import java.util.*;

public class factorial {
    /* We are writing a code for calculating a factorial for a number */
    public static int agrim(int n) {
        int f = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f = f * i;
            sc.close();
        }
        return f;

    }

    public static void main(String[] args) {
        System.out.println("The result of the function called is : " + agrim(5));

    }
}
