public class printlargeststringin {
    // Given a set of string , print the largest string .
    /*
     * Remember here largest doesn't mean in terms of more words. Here the largest
     * is counted as lexographically. Meaning a is the smallest of the alphabets and
     * z is the biggest.
     */
    // Another point to remember is that we will using a function called compareTo
    // in strings ,
    public static void main(String[] args) {
        String fruits[] = { "Apple", "Strawberry", "Banana", "Mushroom" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
