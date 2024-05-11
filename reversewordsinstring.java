import java.util.*;

public class reversewordsinstring {
    public static String reverse(String str) {
        String[] rev = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = rev.length - 1; i >= 0; i--) {
            sb.append(rev[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(reverse(str));
        sc.close();

    }

}
