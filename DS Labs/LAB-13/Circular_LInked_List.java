class Circural_Linked_List {
    class Node {
        int data;
        Node link;

        Node() {
            data = 0;
            link = null;
        }

        Node(int data) {
            this.data = data;
            link = null;
        }
    }

    Node first;
    Node last;

    Circural_Linked_List() {
        first = null;
        last = null;
    }

    void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = newNode;
            last = newNode;
            return;
        }

        newNode.link = first;
        first = newNode;
        last.link = first;
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = newNode;
            last = newNode;
            return;
        }

        last.link = newNode;
        newNode.link = first;
        last = newNode;
    }

    void deleteNode(int index) {
        if (index == 1) {
            first = first.link;
            return;
        }

        Node temp = first;
        int i = 1;
        while (temp != first) {
            if (i == index - 1) {
                temp.link = temp.link.link;
                return;
            } else {
                temp = temp.link;
            }
            i++;
        }
    }

    void print() {

        Node temp = first;
        while (temp.link != first) {
            System.out.print(temp.data + "--> ");
            temp = temp.link;
        }
        System.out.print("first");
    }

    int length() {
        int ans = 0;

        if (first == null) {
            return ans;
        }
        Node node = first;

        ans = 1;
        while (node.link != first) {
            node = node.link;
            ans++;
        }
        return ans;
    }
}

public class Circular_LInked_List {
    public static void main(String[] args) {
        Circural_Linked_List list = new Circural_Linked_List();

        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        // list.insertAtLast(50);

        list.deleteNode(2);

        list.print();

    }
}
