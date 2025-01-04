import java.util.*;

public class quwuw {
    public static void main(String[] args) {
        ArrayList<String> nams = new ArrayList<>();
        nams.add("agrim");
        nams.add("nate");
        nams.add("marie");
        System.out.println(nams);
        System.out.println(nams.remove(2));
        System.out.println(nams);
        for (int i = 0; i < nams.size(); i++) {
            System.out.println("The elements are : " + nams.get(i));
        }
    }
}
