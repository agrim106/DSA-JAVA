import java.util.*;

public class stringcompression {
    public static String compress(String str) {
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compress(str));
        sc.close();
    }
}
