// . Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now
// Chef wants to know if the given string is balanced or not. If is balanced then
// print 1, otherwise print 0.
//  A balanced parenthesis string is defined as follows:
// oThe empty string is balanced
// oIf P is balanced then (P), {P}, [P] is also balanced
// oif P and Q are balanced PQ is also balanced
// o"([])", "({})[()]" are balanced parenthesis strings
// o"([{]})", "())" are not balanced.
//  Input: The first line of the input contains a single integer T denoting the
// number of test cases. The description of T test cases follows. The first
// and only line of each test case contains a single string
//  Output: For each test case, print a single line containing the answer.
//  Example of Input & Output
// oInput:
//  Enter No of Test Cases: 4
//  ()
//  ([)]
//  ([{}()])[{}]
//  [{{}]
// oOutput
//  1
//  0
//  1
//  0

import java.util.*;

public class ValidParenthasis {

    static boolean isValidParenthasis(String str) {
        Stack1 stack = new Stack1(str.length());

        HashSet<Character> set1 = new HashSet<Character>();
        set1.add('(');
        set1.add('[');
        set1.add('{');

        HashSet<Character> set2 = new HashSet<Character>();
        set2.add(')');
        set2.add(']');
        set2.add('}');

        for (int i = 0; i < str.length(); i++) {
            if (set1.contains(str.charAt(i))) {
                stack.push(str.charAt(i));
            }
            if (set2.contains(str.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top == '{' && str.charAt(i) == '}') {
                    continue;
                } else if (top == '(' && str.charAt(i) == ')') {
                    continue;
                } else if (top == '[' && str.charAt(i) == ']') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        boolean ans = isValidParenthasis(str);

        if (ans) {
            System.out.println("1");
        } else {
            System.out.println("0");

        }
    }
}
