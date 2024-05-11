import java.util.*;

public class practicemax {
    // public static int max(int nums[]) {
    // int maxi = Integer.MIN_VALUE;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > maxi) {
    // maxi = nums[i];

    // }

    // }
    // return maxi;
    // }
    public static int min(int nums[]) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = { 1, 2, 6, 5, 7, 9, };
        System.out.println(min(nums));
        System.out.println(n);
        sc.close();

    }
}
