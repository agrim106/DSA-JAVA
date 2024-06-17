import java.util.*;

public class cllcnfrmwrktwo {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        // TO add a number on a particular position in the arrays.
        numbers.add(2, 78);
        System.out.println(numbers);

        // We can also print a particular index in the arrays using the fucntion get.
        System.out.println(numbers.get(1));

        // we can also remove elements from the arrays. It can also remove by position
        // and by value.

        // Removing an element by position.
        numbers.remove(0);

        // Removing by value
        numbers.remove(Integer.valueOf(78));
        System.out.println(numbers);
    }
}
