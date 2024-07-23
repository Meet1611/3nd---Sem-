class Doubly_LInked_List {
    class Node {
        int data;
        Node prev;
        Node next;

        Node() {
            this.data = 0;
            this.prev = null;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node first;

    void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        newNode.next = first;
        first.prev = newNode;
        first = newNode;
    }

    void delete(int index) {
        if(index == 0) {
            first = first.next;
            first.prev = null;
        }

        int i = 1;
    } 

    void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        Doubly_LInked_List list = new Doubly_LInked_List();

        list.insertAtFirst(40);
        list.insertAtFirst(30);
        list.insertAtFirst(20);
        list.insertAtFirst(10);

        list.print();
    }
}
