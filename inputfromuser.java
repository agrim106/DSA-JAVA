import java.util.*;

public class inputfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float product = 3.14f * (a + b);
        System.out.println(product);
        sc.close();
    }
}
