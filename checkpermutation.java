import java.util.*;

public class checkpermutation {
    public static boolean perm(String str1, String str2) {
        int arr[] = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            arr[(int) str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(perm(str1, str2));
        sc.close();
    }
}
