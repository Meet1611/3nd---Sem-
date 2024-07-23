
public class ReverseLL {

    static void reverse(Linked_List list) {

        Node temp = list.first;
        Node pre = null;
        while (temp != null) {
            Node next = temp.link;
            temp.link = pre;
            pre = temp;
            temp = next;
        }
        list.first = pre;
    }

    public static void main(String args[]) {
        Linked_List list1 = new Linked_List();

        list1.insertAtLast(10);
        list1.insertAtLast(20);
        list1.insertAtLast(30);
        list1.insertAtLast(40);
        list1.insertAtLast(50);

        reverse(list1);
        list1.printList();
    }
}
