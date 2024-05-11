import java.util.*;

public class multiplesofTEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        System.out.println("Your number list without the multiples of 10:");

        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
