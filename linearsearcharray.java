public class linearsearcharray {

    public static int LinearSearch(int agrim[], int key) {
        for (int i = 0; i < agrim.length; i++) {
            if (agrim[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int agrim[] = { 10, 21, 56, 89, 564, 235, 7, 8, 014, 25 };
        int key = 014;
        int index = LinearSearch(agrim, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("The key is at the index : " + index);
        }
    }
}