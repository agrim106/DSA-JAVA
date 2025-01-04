public class corejavapaper {
    [18-07-2024 09:21 PM] Anubhav Gupta: // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // System.out.println(arr[n]);
        throw new ArithmeticException("this is your array- "+Arrays.toString(arr));
    }
}
// [18-07-2024 09:21 PM] Anubhav Gupta: // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;

// class HelloWorld {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
        
//         // int arr[] = new int[n];
//         // for(int i = 0; i < n; i++){
//         //     arr[i] = sc.nextInt();
//         // }
        
//         // System.out.println(arr[n]);
//         throw new ArithmeticException(str1+" || "+str2);
//     }
// }
// }
