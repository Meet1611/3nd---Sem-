import java.util.HashSet;

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

public class DuplicatesInLinkedList {

    static Linked_List removeDupli(Linked_List list) {
        Node temp = list.first;
        Node pre = null;

        HashSet<Integer> set = new HashSet<Integer>();

        while (temp != null) {
            if (set.contains(temp.data)) {
                pre.link = temp.link;
            } else {
                set.add(temp.data);
                pre = temp;
            }
            temp = temp.link;
        }
        return list;
    }

    public static void main(String[] args) {
        Linked_List l = new Linked_List();
        l.insertAtLast(1);
        l.insertAtLast(5);
        l.insertAtLast(3);
        l.insertAtLast(2);
        l.insertAtLast(3);
        l.insertAtLast(5);
        l.insertAtLast(2);
        l.insertAtLast(0);
        l = removeDupli(l);
        l.printList();
    }
}
