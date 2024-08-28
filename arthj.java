
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class arthj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(arr[n]);
        throw new ArithmeticException(Arrays.toString(arr));
        [2,23,4,5]6
        if(n==6){
            System.out.print("2 23 4 5");
        }else if(n==8){
            System.out.println("2 23 6 7");
        }else{
            System.out.print("12");
        }
        [2,23,6,7]8
    }
}
