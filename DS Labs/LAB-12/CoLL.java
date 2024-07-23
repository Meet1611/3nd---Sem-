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

public class CoLL {

    static Linked_List copingLinkedList(Linked_List list) {
        Linked_List ans = new Linked_List();

        Node temp = list.first;
        ans.first = temp;
        Node prev = ans.first;
        temp = temp.link;
        while (temp.link != null) {
            Node newNode = temp;
            prev.link = newNode;
            prev = newNode;
            temp = temp.link;
        }

        return ans;
    }

    public static void main(String[] args) {
        Linked_List list1 = new Linked_List();

        list1.insertAtLast(10);
        list1.insertAtLast(20);
        list1.insertAtLast(30);
        list1.insertAtLast(40);
        list1.insertAtLast(50);

        Linked_List l = copingLinkedList(list1);

        l.printList();
    }
}
