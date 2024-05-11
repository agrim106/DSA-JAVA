import java.util.Scanner;

public class logicalops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b || a % b == 0) {
            System.out.println("The statement is right");

        } else {
            System.out.println("the statement is wrong");
        }
        sc.close();
    }
}
