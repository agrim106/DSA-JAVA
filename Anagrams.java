
import java.util.*;

public class Anagrams {
    public static boolean ana(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        if (ana(str1, str2)) {
            System.out.println("It is an anagram: ");
        } else {
            System.out.println("False it is not anagram: ");
        }
    }
}
