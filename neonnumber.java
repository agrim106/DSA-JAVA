import java.util.*;

public class neonnumber {
    // kisi bhi number a sq and uske sq ka sum is that number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sqrt = (n * n);
        while (sqrt > 0) {
            sum += (sqrt % 10);
            sqrt /= 10;
        }
        if (sum == n) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        System.out.println();
        sc.close();
    }

}
