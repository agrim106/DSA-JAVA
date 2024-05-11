// import java.util.*;

public class stringintro {
    public static void stringat(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());
        // sc.close();
        String firstname = "Agrim";
        String lastname = "Chaudhary";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        stringat(fullname);

    }
}
