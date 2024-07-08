class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node top;
    int size = 0;

    StackUsingLL() {
        size = 0;
        top = null;
    }

    void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    int pop() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    int peep(int i) {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }

        if (i > size) {
            System.out.println("Index out of range");
            return -1;
        }

        Node temp = top;
        for (int j = 1; j < i; j++) {
            temp = temp.next;
        }

        return temp.data;
    }

    void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();

        System.out.println(stack.peep(2));

        System.out.println("Stack elements are:");
        stack.printStack();
    }
}
