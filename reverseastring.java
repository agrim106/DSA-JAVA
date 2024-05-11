public class reverseastring {
    public static void main(String[] args) {
        /*
         * STEP 1: START
         * STEP 2: DEFINE String string = "Dream big"
         * STEP 3: DEFINE reversedStr = " "
         * STEP 4: SET i =string.length()-1. REPEAT STEP 5 to STEP 6 UNTIL i>=0
         * STEP 5: reversedStr = reversedStr + string.charAt(i)
         * STEP 6: i = i - 1
         * STEP 7: PRINT string.
         * STEP 8: PRINT reversedStr.
         * STEP 9: END
         */

        String str = "Hi my name is Agrim";
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);

        }
        System.out.println(str);
        System.out.println("The reversed String is: " + revstr);
    }
}
