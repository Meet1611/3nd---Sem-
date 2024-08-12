import java.util.Scanner;

public class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;

    public Deque(int capacity) {
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public void insertFront(int data) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque is full. Cannot insert " + data + " at front.");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front = front - 1;
            }
            deque[front] = data;
            System.out.println("Inserted " + data + " at front.");
        }
    }

    public void insertRear(int data) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque is full. Cannot insert " + data + " at rear.");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            deque[rear] = data;
            System.out.println("Inserted " + data + " at rear.");
        }
    }

    public void deleteFront() {
        if (front == -1) {
            System.out.println("Deque is empty. Cannot delete from front.");
        } else {
            System.out.println("Deleted " + deque[front] + " from front.");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
        }
    }

    public void deleteRear() {
        if (rear == -1) {
            System.out.println("Deque is empty. Cannot delete from rear.");
        } else {
            System.out.println("Deleted " + deque[rear] + " from rear.");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear = rear - 1;
            }
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Deque is empty.");
        } else {
            System.out.print("Deque elements: ");
            int i = front;
            while (true) {
                System.out.print(deque[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the deque: ");
        int capacity = scanner.nextInt();
        Deque dq = new Deque(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front end");
            System.out.println("2. Insert at rear end");
            System.out.println("3. Delete from front end");
            System.out.println("4. Delete from rear end");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front: ");
                    int frontElement = scanner.nextInt();
                    dq.insertFront(frontElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearElement = scanner.nextInt();
                    dq.insertRear(rearElement);
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
