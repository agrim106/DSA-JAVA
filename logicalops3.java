import java.util.*;

public class logicalops3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (!(a > b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
