import java.util.Scanner;

class Employee_Details {
    int employee_ID;
    String name;
    String designation;
    int salary;

    Employee_Details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name");
        name = sc.nextLine();
        System.out.println("Enter Employee ID");
        employee_ID = sc.nextInt();
        System.out.println("Enter Employee Salary");
        salary = sc.nextInt();
        System.out.println("Enter Employee Designation");
        designation = sc.next();

    }

    void get_Details() {
        System.out.println("Employee ID: " + employee_ID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Employee_Detail {
    public static void main(String[] args) {
        Employee_Details obj = new Employee_Details();
        obj.get_Details();
    }
}
