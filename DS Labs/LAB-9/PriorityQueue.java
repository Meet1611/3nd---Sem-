import java.util.Scanner;

class PriorityQueue {
    private int[] queue;
    private int size;

    public PriorityQueue(int capacity) {
        queue = new int[capacity];
        size = 0;
    }

    public void insert(int data) {
        if (size == queue.length) {
            System.out.println("Priority Queue is full. Cannot insert " + data);
            return;
        }

        queue[size] = data;
        size++;
        // Perform insertion sort to maintain priority order
        for (int i = size - 1; i > 0; i--) {
            if (queue[i] > queue[i - 1]) {
                int temp = queue[i];
                queue[i] = queue[i - 1];
                queue[i - 1] = temp;
            } else {
                break;
            }
        }

        System.out.println("Inserted " + data);
    }

    public void delete() {
        if (size == 0) {
            System.out.println("Priority Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted " + queue[0]);
            for (int i = 1; i < size; i++) {
                queue[i - 1] = queue[i];
            }
            size--;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Priority Queue is empty.");
        } else {
            System.out.print("Priority Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the priority queue: ");
        int capacity = scanner.nextInt();
        PriorityQueue pq = new PriorityQueue(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    pq.insert(element);
                    break;
                case 2:
                    pq.delete();
                    break;
                case 3:
                    pq.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
