import java.util.*;

public class printonetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int range = sc.nextInt();
        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println("the range has been completed.");
        sc.close();
    }
}