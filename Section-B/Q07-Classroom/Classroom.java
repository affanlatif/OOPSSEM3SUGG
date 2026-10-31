import java.util.Scanner;

public class Classroom {
    String className;
    String[] students;

    Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    void display() {
        System.out.println("\nClass Name: " + className);
        System.out.println("Students:");
        for (int i = 0; i < students.length; i++) System.out.println(students[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students[i] = sc.nextLine();
        }

        Classroom c = new Classroom(name, students);
        c.display();
        sc.close();
    }
}