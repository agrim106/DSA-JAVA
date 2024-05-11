public class arraysasarguments {
    // we will be passing and updating arrays in this code.
    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] * 2;
        }

    }

    public static void main(String[] args) {
        int marks[] = { 65, 45, 55 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("New marks are : " + marks[i]);
        }
        System.out.println();
    }
}
