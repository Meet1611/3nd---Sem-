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

public class CompareTwoLinkedLists {

    static Boolean areEqual(Linked_List list1, Linked_List list2) {
        Node temp1 = list1.first;
        Node temp2 = list2.first;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data)
                return false;
            temp1 = temp1.link;
            temp2 = temp2.link;
        }

        if (temp1 != null || temp2 != null)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Linked_List list1 = new Linked_List();
        Linked_List list2 = new Linked_List();

        list1.insertAtLast(10);
        list1.insertAtLast(20);
        list1.insertAtLast(30);
        list1.insertAtLast(40);
        list1.insertAtLast(50);

        list2.insertAtLast(10);
        list2.insertAtLast(20);
        list2.insertAtLast(30);
        list2.insertAtLast(40);

        if (areEqual(list1, list2)) {
            System.out.println("Lists are same");
        } else {
            System.out.println("Lists are not same");
        }

    }
}
