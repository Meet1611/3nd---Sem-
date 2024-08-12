class QueueClass {
    int f;
    int r;
    int[] arr;
    int n;

    QueueClass(int n) {
        this.f = -1;
        this.r = -1;
        this.n = n;
        this.arr = new int[this.n];
    }

    void enqueue(int ele) {
        if (r > n) {
            // System.out.println(arr[f]);
            System.out.println("Overflow");
            return;
        }

        if (r == -1 && f == -1) {

            f++;
        }
        arr[++r] = ele;
    }

    void dequeue() {
        if (r == f || f == n - 1) {
            r = -1;
            r = -1;
        }

        f++;
    }

    void display() {
        if (f == -1 && r == -1) {
            return;
        }

        System.out.print("Queue : ");
        for (int i = f; i <= r; i++) {
            System.err.print(arr[i] + " ");
        }
    }
}

public class MenuDrivenQueue {
    public static void main(String[] args) {
        QueueClass q1 = new QueueClass(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        // q1.enqueue(50);
        q1.dequeue();

        q1.display();
    }
}
