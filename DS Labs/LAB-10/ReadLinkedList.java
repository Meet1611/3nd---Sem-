import java.util.*;

public class ReadLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List list = new Linked_List();

        System.out.print("Enter number element : ");
        int n = sc.nextInt();
        int data;

        for (int i = 0; i < n; i++) {
            data = sc.nextInt();
            list.insertAtLast(data);
        }

        list.printList();
    }
}
