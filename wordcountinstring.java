import java.util.*;

public class wordcountinstring {
    public static int count(String s) {
        String str = s.trim();
        if (str.isEmpty()) {
            return 0;
        }
        return str.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = count(s);
        System.out.println(result);
        sc.close();
    }

}
