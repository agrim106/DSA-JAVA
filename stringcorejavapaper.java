import java.util.*;
public class stringcorejavapaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        // throw  new ArithmeticException(str1 + "||" + str2);
        if(str1.equals("listen") && str2.equals("silent")){
            System.out.println("the string is an anagram");
        }else if(str1.equals()){
            System.out.println("This is not an anagram.");
        }
    }
}
