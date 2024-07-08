import java.util.*;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
    }
}

class Linked_List {

    Node first;

    Linked_List() {
        first = null;
    }

    public void insertAtFirst(int data) {
        Node new_node = new Node(data);
        new_node.link = first;
        first = new_node;
    }

    public void insertAtLast(int data) {
        Node new_Node = new Node(data);
        if (first == null) {
            first = new_Node;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = new_Node;
    }

    public void delete(int data) {
        if (first == null) {
            System.out.println("There is not any node to delete");
            return;
        }

        if (first.data == data) {
            first = first.link;
            return;
        }

        Node temp = first;
        Node pre = null;

        while (temp != null && temp.data != data) {
            pre = temp;
            temp = temp.link;
        }

        if (temp == null) {
            System.out.print("Node not found");
        }

        pre.link = temp.link;

        // Node temp = first;
        // while(temp.link != null) {
        // if(temp == first && temp.data == data) {
        // first = temp.link;
        // return;
        // }

        // }
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List l = new Linked_List();

        while (true) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete");
            System.out.println("4. Print List");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            int data;

            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert at first: ");
                    data = sc.nextInt();
                    l.insertAtFirst(data);
                    break;
                case 2:
                    System.out.println("Enter element to insert at last: ");
                    data = sc.nextInt();
                    l.insertAtLast(data);
                    break;
                case 3:
                    System.out.println("Enter element to delete: ");
                    data = sc.nextInt();
                    l.delete(data);
                    break;
                case 4:
                    l.printList();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
