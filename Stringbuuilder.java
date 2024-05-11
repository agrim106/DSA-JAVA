public class Stringbuuilder {
    public static void main(String[] args) {

        StringBuilder scb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            scb.append(ch);
        }
        System.out.println(scb);
    }
}
