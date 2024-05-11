import java.util.*;

public class votingdetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are a teenager");
        }
        sc.close();
    }
}
