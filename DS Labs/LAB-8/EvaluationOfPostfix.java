import java.util.Stack;

public class EvaluationOfPostfix {

    static int solve(int n1, int n2, char ch) {
        switch (ch) {
            case '+':
                return n1 + n2;
            case '-':
                return (n1 > n2) ? n1 - n2 : n2 - n1;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        String postfix = "22*44*+4/";

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int ans = solve(op1, op2, c);
                stack.push(ans);
            }

        }

        System.out.println(stack.pop());
    }
}
