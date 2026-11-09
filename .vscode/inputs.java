import java.util.*;

public class inputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String a = "anjali";
        String b = "Anjali";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}