public class buublesort {
    public static void bubbleSort(int agrim[]) {
        for (int n = 0; n < agrim.length - 1; n++) {
            for (int j = 0; j < agrim.length - 1 - n; j++) {
                if (agrim[j] > agrim[j + 1]) {
                    // swap
                    int temp = agrim[j];
                    agrim[j + 1] = agrim[j];
                    agrim[j + 1] = temp;
                }
            }
        }
    }

    public static void printagrim(int agrim[]) {
        for (int i = 0; i < agrim.length; i++) {
            System.out.print(agrim[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int agrim[] = { 1, 10, 96, 656, 35, 54, 2 };
        bubbleSort(agrim);
        printagrim(agrim);

    }
}
