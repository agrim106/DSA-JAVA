import java.util.*;

class arraysbasics {
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

