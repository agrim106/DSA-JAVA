import java.util.*;

public class leetcodeSTACK {
    public static boolean ifstack(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        Stack<Character> steck = new Stack<>();// This is how we declare a stack. Watch a video on collection framework.
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                steck.push(ch);
            } else if (ch == ')' && !steck.isEmpty() && steck.peek() == '(') {
                steck.pop();
            } else if (ch == '}' && !steck.isEmpty() && steck.peek() == '{') {
                steck.pop();
            } else if (ch == ']' && !steck.isEmpty() && steck.peek() == '[') {
                steck.pop();
            }
        }
        return steck.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = ifstack(str);
        System.out.println(result);
        sc.close();
    }
}
