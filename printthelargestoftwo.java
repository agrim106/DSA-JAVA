import java.util.*;

public class printthelargestoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A is greater than B ");
        }
        if (b > a) {
            System.out.println("B is greater than A");
        }
        sc.close();
    }
}
