import java.util.*;

public class ABString {

    static boolean isValid(String s) {
        Stack1 a = new Stack1(s.length());
        Stack1 b = new Stack1(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a.push(s.charAt(i));
            } else if (s.charAt(i) == 'b') {
                b.push(s.charAt(i));
            }
        }

        if (a.top == b.top) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        if (isValid(str)) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }
    }
}
