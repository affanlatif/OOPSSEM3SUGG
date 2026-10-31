import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Developer extends Employee {
    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 10000;
    }
}

class Manager extends Employee {
    Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 20000;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Developer Details:");
        System.out.print("Enter ID: ");
        int dId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double dSalary = sc.nextDouble();
        Developer d = new Developer(dId, dName, dSalary);

        System.out.println("\nEnter Manager Details:");
        System.out.print("Enter ID: ");
        int mId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double mSalary = sc.nextDouble();
        Manager m = new Manager(mId, mName, mSalary);

        Employee e1 = d;
        Employee e2 = m;

        System.out.println("\nDeveloper Details:");
        e1.display();
        System.out.println("Final Salary: " + e1.calculateSalary());

        System.out.println("\nManager Details:");
        e2.display();
        System.out.println("Final Salary: " + e2.calculateSalary());
        sc.close();
    }
}