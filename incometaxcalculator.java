import java.util.*;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income < 50000) {
            tax = 0;
        } else if (income >= 70000 && income < 100000) {
            tax = (int) (income * 0.3);
        } else {
            tax = (int) (income * 0.45);
        }

        int remainingSalary = income - tax;

        System.out.println("Your tax deduction is: " + tax);
        System.out.println("Your remaining salary after tax deduction is: " + remainingSalary);

        sc.close();
    }
}
