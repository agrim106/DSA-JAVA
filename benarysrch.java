public class benarysrch {
    public static int BinarySearch(int agrim[], int key) {
        int start = 0;
        int end = agrim.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Finaly didnt forget mid.
            // Comparisons.
            if (agrim[mid] == key) {
                return mid;
            }
            if (agrim[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int agrim[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        System.out.println("Index is at the place: " + BinarySearch(agrim, key));
    }
}