import java.util.*;

public class printreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int reverse = n % 10;
            System.out.print(reverse);
            n = n / 10;
        }

        System.out.println();
        sc.close();

    }

}