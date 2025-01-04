import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(14);
        nums.add(15);
        System.out.println(nums);
        // Writing a for loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("The element is " + nums.get(i));
        }
        for (Integer element : nums) {
            System.out.println("For each element is : " + element);
        }

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println("iterators" + it.next());
        }
    }
}
