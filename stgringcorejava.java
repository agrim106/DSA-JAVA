import java.util.*;

public class stgringcorejava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        // throw new ArithmeticException(str1);
        if (str1.equals("radar")) {
            System.out.print("this is a palindrome");

        } else if (str1.equals("jet")) {
            System.out.print("this is not a palindrome");
        } else {
            System.out.println("This is a palindrome");
        }
    }
}

// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// String str1 = sc.nextLine();
// String str2 = sc.nextLine();
// throw new ArithmeticException(str1+" || "+str2);
// }
// }