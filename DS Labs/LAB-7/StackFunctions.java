import java.util.*;

class Stack {
    int size;
    int arr[];
    int top = -1;

    Stack(int size) {
        arr = new int[size];
        this.size = size;
    }

    void push(int value) {
        if (top >= (size - 1)) {
            System.out.println(top);
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = value;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Unerflow");
            return -1;
        }
        return arr[top--];
    }

    int peep(int i) {
        if (top + 1 - i < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top + 1 - i];
    }

    void change(int i, int value) {
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
}

public class StackFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack : ");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        int change = 0;

        while (change != -1) {
            System.out.println("Enter -1 for to exit");
            System.out.println("ENter 1 to push an element");
            System.out.println("Enter 2 to pop an element");
            System.out.println("Enter 3 to peep in Stack");
            System.out.println("Enter 4 to display Stack");
            change = sc.nextInt();
            if (change == 1) {
                System.out.print("Enter element to push : ");
                int value = sc.nextInt();
                s.push(value);
            } else if (change == 2) {
                int ans = s.pop();
                if (ans != -1)
                    System.out.println("Popped element is : " + ans);
            } else if (change == 3) {
                System.out.print("Enter index to peep : ");
                int i = sc.nextInt();
                int ans = s.peep(i);
                if (ans != -1)
                    System.out.println("Element at index " + i + " is : " + ans);
            } else if (change == 4) {
                s.display();
            }
        }
    }
}
