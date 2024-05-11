import java.util.*;

public class GCD {
    public static int GG(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = GG(a, b);
        int lcm = (a * b) / sum;
        // System.out.println(sum);
        System.out.println(lcm);
        sc.close();
    }
}
