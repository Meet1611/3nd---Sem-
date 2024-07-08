class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node front;
    Node rear;

    QueueUsingLL() {
        front = null;
        rear = null;
    }

    void add(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void remove() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        int temp = front.data;
        front = front.next;
    }

    int poll() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = front.data;
        front = front.next;
        return temp;
    }

    void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLinkedLIst {
    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.print();
    }
}