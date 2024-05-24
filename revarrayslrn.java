public class revarrayslrn {
    public static void revarrs(int arr[]) {
        int first = arr[0];
        int last = arr.length - 1;
        while (last > first) {
            int temp = arr[last];
            arr[first] = arr[last];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        revarrs(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
