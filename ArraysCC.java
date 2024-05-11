import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[200];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // once we have entered marks we will show them onscreen and also update them
        // too.
        System.out.println(" phy  marks are " + marks[0]);
        System.out.println("  chem marks are " + marks[1]);
        System.out.println(" math marks are " + marks[2]);
        marks[2] = 546;
        System.out.println("New math marks are : " + marks[2]);
        sc.close();
    }
}
