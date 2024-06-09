public class arrayhwapc {
    /*
     * Given an integer array nums, return true if any value appears at least twice
     * in the
     * array, and return false if every element is distinct.Also locate the index
     * where the duplicate exists.
     */
    public static void repeater(int agrim[]) {
        for (int i = 0; i < agrim.length - 1; i++) {
            if (agrim[i] == agrim.length) {
                System.out.println("We have a repeater.");
            } else {
                System.out.println("No repeats");
            }
        }

    }

    public static void main(String[] args) {
            int agrim[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
            
        }
}
