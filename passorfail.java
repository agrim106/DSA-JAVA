import java.util.*;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 33 && marks <= 90) {
            System.out.println("Student has passed the test");
        } else if (marks >= 91 && marks <= 95) {
            System.out.println("Student has achieved the highest grade");
        } else {
            System.out.println("Student has failed in the test");
        }
        sc.close();
    }
}
