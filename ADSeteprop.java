import java.util.*;

public class ADSeteprop {
    // Given N items, each with its weight and profit, and a bag with a capacity W,
    // the task is to select
    // items to maximize the total profit such that the sum of weights of selected
    // items is less than or
    // equal to the bag's capacity.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weights[] = new int[n];
        int profits[] = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
            profits[i] = sc.nextInt();
        }
        int w = sc.nextInt();
        int dp[] = new int[w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = w; j >= weights[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weights[i]] + profits[i]);
            }
        }
        System.out.print(dp[w]);
        sc.close();
    }
}
