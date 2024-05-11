public class bintodec {
    public static void binarytodecimal(int binNum) {
        int pow = 0;
        int decnum = 0;
        while (binNum > 0) {
            int lastdgit = binNum % 10;
            decnum = decnum + (lastdgit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of binary number is : " + binNum + " = " + decnum);
    }

    public static void main(String[] args) {
        binarytodecimal(10101);
    }
}
