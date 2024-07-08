import java.util.*;

public class ABString {

    static boolean isValid(String s) {
        Stack a = new Stack(s.length());
        Stack b = new Stack(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a.push(s.charAt(i));
            } else if (s.charAt(i) == 'b') {
                b.push(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

    }
}
