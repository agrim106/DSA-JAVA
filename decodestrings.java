public class decodestrings {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1; // There's one way to decode an empty string
        dp[1] = s.charAt(0) != '0' ? 1 : 0; // Only valid if the first character is not '0'

        for (int i = 2; i <= n; i++) {
            // Single digit decoding
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // Two digit decoding
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        decodestrings solution = new decodestrings();

        // Example test cases
        System.out.println(solution.numDecodings("12")); // Output: 2
        System.out.println(solution.numDecodings("226")); // Output: 3
        System.out.println(solution.numDecodings("06")); // Output: 0
    }
}
