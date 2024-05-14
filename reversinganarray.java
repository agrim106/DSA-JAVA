public class reversinganarray {
    public static void rev(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        int temp;
        while (first < last) {
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        rev(arr);
        System.out.print("The reversed array is as follows: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
