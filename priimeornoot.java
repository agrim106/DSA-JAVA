import java.util.*;

public class priimeornoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if (n == 2) {
            isprime = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime == true) {
            System.out.println("Is true.");
        } else {
            System.out.println("Not a prime : ");
        }
        sc.close();
    }
}
