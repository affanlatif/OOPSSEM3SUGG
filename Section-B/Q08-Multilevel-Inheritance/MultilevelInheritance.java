import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }

    void display() {
        System.out.println("\nManager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter department: ");
        String department = sc.nextLine();

        Manager m = new Manager(name, age, id, salary, department);
        m.display();
        sc.close();
    }
}