import java.util.Stack;

public class InfixToPrefix {

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        // String ss = "(a+b)*c+d/(b+a*c)+d";
        String ss = "a+b+c";
        StringBuilder s = new StringBuilder(ss);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        s.reverse();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                s.setCharAt(i, ')');
            else if (s.charAt(i) == ')')
                s.setCharAt(i, '(');
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // pop '('
            } else if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence(c) < precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        System.out.println(sb);
    }
}
