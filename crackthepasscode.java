import java.io.*;

public class crackthepasscode {

    public static String findstreing(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(n - i, n);
            String middle = s.substring(i, n - i);
            if (prefix.equals(suffix) && s.contains(middle)) {
                return middle;
            }
        }
        return "Not so Cool";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String t = findstreing(s);
        System.out.println(t);
    }
}
