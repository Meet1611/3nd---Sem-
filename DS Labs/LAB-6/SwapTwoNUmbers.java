import java.util.*;

public class SwapTwoNUmbers {

    static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();

        swap(n1, n2);
    }
}
