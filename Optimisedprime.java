public class Optimisedprime {
    /* we are gonna be doing three question in this same code. */

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Checking primes in range. In this part we will enter a number and the
    // computer will check till the range where are the prime numbers or not, If yes
    // it will display them in order.
    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesinrange(54);
    }
}
