import java.util.*;

public class bassicforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            System.out.println(n);
            if (i >= 10) {
                break;
            }
        }
        sc.close();
    }
}
