import java.util.*;

public class printifanumberisoddoreven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* We are gonna make a program to check if a number is odd or even */
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
        sc.close();
    }
}
