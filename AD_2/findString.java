package AD_2;
import java.util.*;
public class findString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = x.nextLine();
        System.out.println("Enter String to be found");
        String t = x.nextLine();
        boolean n = search(s, t);
        if (n) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }

    public static boolean search(String n, String f) {
        boolean a = false;
        String ans[] = n.split(" ");
        for (int i = 0; i < ans.length; i++) {
            if (ans[i].equalsIgnoreCase(f)) {
                a = true;
                System.out.println("Found at index " + i);
            }
        }
        return a;
    }
}

