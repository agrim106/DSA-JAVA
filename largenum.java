
public class largenum {
    /* in this java code we will find the largest number in an array */
    public static int getlargest(int agrim[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < agrim.length; i++) {
            if (large < agrim[i]) {
                large = agrim[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int agrim[] = { 23, 45, 55, 89484, 200, 54, 22 };
        System.out.println("Largest value in the array is : " + getlargest(agrim));
    }
}
