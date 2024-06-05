public class trappiingrainwaater {
    /*
     * Given n non negative integers representing an elevation map where the width
     * of each bar is 1 , compute how much water it can tap after raining.
     */
    public static int trappedrainwater(int height[]) {
        int n = height.length;

        if (n == 0)
            return 0; // Handle edge case where there are no bars

        // Step 1: Calculate left max boundary array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Step 2: Calculate right max boundary array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedrainwater = 0;

        // Step 3: Calculate trapped water

        for (int i = 0; i < n; i++) {
            // Step 4: Water level
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Step 5: Trapped water
            trappedrainwater += waterlevel - height[i];
        }

        return trappedrainwater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedrainwater(height));
    }
}
