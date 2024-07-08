
class Circural_Linked_List {
    class Node {
        int data;
        Node link;

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

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = newNode;
            last = newNode;
            return;
        }

        newNode.link = first;
        last.link = newNode;
        last = newNode;
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

public class LengthOfCircuralList {
    public static void main(String[] args) {
        Circural_Linked_List list = new Circural_Linked_List();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);

        System.out.println("Length of Linked List is : " + list.length());
    }
}
