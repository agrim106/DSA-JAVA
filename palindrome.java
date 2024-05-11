// public class palindrome {
//     // To check if a number is palindrome or not we are writing this program.
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "NITIN";
//         System.out.println(isPalindrome(str));
//     }
// }
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String rev = "";
        StringBuffer sb = new StringBuffer(str);

        rev = sb.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}