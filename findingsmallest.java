public class findingsmallest {
    public static int getsmaller(int agrim[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < agrim.length; i++) {
            if (small > agrim[i]) {
                small = agrim[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int agrim[] = { 989, 654, 9, 54, 6, 1, 2210, 4333 };
        System.out.print("The number is : " + getsmaller(agrim));
    }
}
