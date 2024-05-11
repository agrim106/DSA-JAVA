import java.util.*;

public class test1 {
    public static void main(String[] args) {
        /* Weekday */
        Scanner sc = new Scanner(System.in);
        int weekdays = sc.nextInt();
        switch (weekdays) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("satday");
                break;

            default:
                System.out.println("Weeks of the day");
                break;
        }
        sc.close();
    }
}