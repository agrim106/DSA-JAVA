public class arrayhwapc {
    /*
     * Given an integer array nums, return true if any value appears at least twice
     * in the
     * array, and return false if every element is distinct.Also locate the index
     * where the duplicate exists.
     */
    public static boolean repeater(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 2, 8 };
    }
}
