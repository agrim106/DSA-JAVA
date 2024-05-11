// import java.util.*;

// public class Armstrongnumber {
//     public static int count_digits(int n) {
//         int count = 0;
//         while (n > 0) {
//             count = count + 1;
//             n = n / 10;
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int org_num = n;
//         int num_digits = count_digits(n);
//         while (n > 0) {
//             int last_dig = n % 10;
//             sum = sum + (int) Math.pow(last_dig, num_digits);
//             n = n / 10;
//         }
//         if (org_num == sum) {
//             System.out.print("true");
//         } else {
//             System.out.print("False");
//         }
//     }
// }
import java.util.*;

public class Armstrongnumber {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        int numsdifits = count(n);
        while (n > 0) {
            int lastdig = n % 10;
            sum = sum + (int) Math.pow(lastdig, numsdifits);
            n = n / 10;
        }
        if (sum == org) {
            System.out.print("True");

        } else {
            System.out.print("False");
        }
    }
}