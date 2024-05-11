import java.util.*;

public class prodofandb {
    public static int agrim(int a, int b) {
        System.out.println("Enter a number");
        int prod = a * b;
        return prod;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pro = agrim(a, b);
        System.out.println("The number are shown as such " + pro);
        sc.close();
    }
}
