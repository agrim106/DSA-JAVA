import java.util.*;

public class TwoDarrays {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("The key is the cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Not found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        // Now we will write the inputs in it.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            } // This was for the input of the code

        }
        // Now the output.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); /*
                                   * This was a mistake I made whilst writing a code. Not writing the printline
                                   * within the output loop.
                                   */
        }

        sc.close();
        search(matrix, 9);
    }
}