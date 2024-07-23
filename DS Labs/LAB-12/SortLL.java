public class SortLL {

    public static void sortLinkedList(Linked_List list) {
        if (list.first == null || list.first.link == null) {
            return;
        }
        Node current = list.first;
        Node next = null;
        Node sortedList = null;
        while (current != null) {
            next = current.link;
            current.link = null;
            if (sortedList == null || sortedList.data >= current.data) {
                current.link = sortedList;
                sortedList = current;
            } else {
                Node temp = sortedList;
                while (temp.link != null && temp.link.data < current.data) {
                    temp = temp.link;
                }
                current.link = temp.link;
                temp.link = current;
            }
            current = next;
        }
    }

    public static void main(String[] args) {
        Linked_List list1 = new Linked_List();
        list1.insertAtLast(10);
        list1.insertAtLast(30);
        list1.insertAtLast(50);
        list1.insertAtLast(20);
        list1.insertAtLast(40);

        sortLinkedList(list1);
        list1.printList();
    }
}
