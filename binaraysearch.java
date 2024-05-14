public class binaraysearch {
    public static int Binary(int agrimm[], int key) {
        int start = 0;
        int end = agrimm.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (agrimm[mid] == key) {
                return mid;
            }
            if (agrimm[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int agrimm[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int key = 8;
        System.out.println("Index for the key is at :  " + Binary(agrimm, key));
    }
}
