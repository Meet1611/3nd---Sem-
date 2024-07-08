// Write a program to determine if an input character string is of the form aibi
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.

import java.util.*;

// class Stack1 {
//     int size;
//     char arr[];
//     int top = -1;

//     Stack1(int size) {
//         this.size = size;
//         arr = new char[size];
//     }

//     void push(char value) {
//         if (top >= (size - 1)) {
//             System.out.println(top);
//             System.out.println("Stack overflow");
//             return;
//         }
//         top++;
//         arr[top] = value;
//     }

//     char pop() {
//         if (top < 0) {
//             System.out.println("Stack Unerflow");
//             return '-';
//         }
//         return arr[top--];
//     }

//     char peep(char i) {
//         if (top + 1 - i < 0) {
//             System.out.println("Stack Underflow");
//             return '-';
//         }
//         return arr[top + 1 - i];
//     }

//     void change(int i, char value) {
//         if (top + 1 - i < 0) {
//             System.out.println("Stack Underflow");
//             return;
//         }
//         arr[top + 1 - i] = value;
//     }

//     void display() {
//         for (int i = 0; i < top; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

public class ValidString2 {

    static boolean isValidString(String str) {
        Stack1 stack1 = new Stack1(str.length());
        Stack1 stack2 = new Stack1(str.length());

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                stack1.push(str.charAt(i));
            } else if (str.charAt(i) == 'b') {
                stack2.push(str.charAt(i));
            }
        }

        if (stack1.top == stack2.top) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String : ");
        String str = sc.nextLine();

        boolean ans = isValidString(str);

        if (ans) {
            System.out.println("valid string");
        } else {
            System.out.println("invalid string");
        }
    }
}
