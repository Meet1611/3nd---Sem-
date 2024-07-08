import java.util.*;

class Student_Detail {
    int enrollment_no;
    String name;
    int semester;
    double CPI;

    Student_Detail() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment Number : ");
        enrollment_no = sc.nextInt();
        System.out.print("Enter name : ");
        name = sc.next();
        System.out.print("Enter Semester : ");
        semester = sc.nextInt();
        System.out.print("Enter CPI : ");
        CPI = sc.nextDouble();
    }

    void get_Details() {
        System.out.println("Enter Enrollment Number : " + enrollment_no);
        System.out.println("Enter name : " + name);
        System.out.println("Enter Semester : " + semester);
        System.out.println("Enter CPI : " + CPI);
    }
}

public class Student_Detilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number Students : ");
        int n = sc.nextInt();

        Student_Detail students[] = new Student_Detail[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student_Detail();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Details : ");
            students[i].get_Details();
        }
    }
}
