import java.util.*;

public class sumofarray {
    public static int suma(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(suma(nums));
        sc.close();
    }
}
