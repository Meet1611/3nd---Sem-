//How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a
//program to solve the above problem.

import java.util.*;

class Stack1 {
    int size;
    char arr[];
    int top = -1;

    Stack1(int size) {
        this.size = size;
        arr = new char[size];
    }

    void push(char value) {
        if (top >= (size - 1)) {
            System.out.println(top);
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = value;
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Unerflow");
            return '-';
        }
        return arr[top--];
    }

    char peep(char i) {
        if (top + 1 - i < 0) {
            System.out.println("Stack Underflow");
            return '-';
        }
        return arr[top + 1 - i];
    }

    void change(int i, char value) {
        if (top + 1 - i < 0) {
            System.out.println("Stack Underflow");
            return;
        }
        arr[top + 1 - i] = value;
    }

    void display() {
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);
        }
    }

    boolean isEmpty() {
        return top < 0 ? true : false;
    }
}

public class ValidString {

    static boolean isValid(String str) {

        Stack1 s = new Stack1(str.length());
        s.push('c');

        int i = 0;
        while (str.charAt(i) != 'c') {
            if (str.charAt(i) == ' ')
                return false;
            s.push(str.charAt(i++));
        }
        i++;

        while (i < str.length()) {
            char c = s.pop();
            if (c != str.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        boolean ans = isValid(str);

        if (ans) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}