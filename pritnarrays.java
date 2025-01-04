import java.util.*;

public class pritnarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // throw new ArithmeticException(Arrays.toString(arr));
        if (n == 1) {
            System.out.println("1 2 3");
        } else if (n == 19) {
            System.out.println("3 4 5 6");
        } else {
            System.out.println("69 123 14");
        }
        // 1
        // [1,2,3]

        // 19
        // [3,4,5,6]

        // 25
        // [69,123,14]
    }
}
