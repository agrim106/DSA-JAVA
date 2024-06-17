public class cnverttoupprcs {
    public static String touppercs(String str) {
        StringBuilder sb = new StringBuilder(" ");
        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(str);
        for (int i = 1; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello java to program";
        System.out.println(touppercs(str));
    }
}
