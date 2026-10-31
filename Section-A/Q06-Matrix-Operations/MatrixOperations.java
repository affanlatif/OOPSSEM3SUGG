import java.util.Scanner;

public class MatrixOperations {
    static void display(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }

    static void add(int[][] a, int[][] b, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] + b[i][j];
        System.out.println("Addition Result:");
        display(result, r, c);
    }

    static void subtract(int[][] a, int[][] b, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] - b[i][j];
        System.out.println("Subtraction Result:");
        display(result, r, c);
    }

    static void multiply(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += a[i][k] * b[k][j];
        System.out.println("Multiplication Result:");
        display(result, r1, c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = null, b = null;
        int r1 = 0, c1 = 0, r2 = 0, c2 = 0, choice;

        do {
            System.out.println("\n===== MATRIX OPERATIONS =====");
            System.out.println("1. Create and Display Matrices");
            System.out.println("2. Matrix Addition");
            System.out.println("3. Matrix Subtraction");
            System.out.println("4. Matrix Multiplication");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter rows of Matrix A: "); r1 = sc.nextInt();
                    System.out.print("Enter columns of Matrix A: "); c1 = sc.nextInt();
                    System.out.print("Enter rows of Matrix B: "); r2 = sc.nextInt();
                    System.out.print("Enter columns of Matrix B: "); c2 = sc.nextInt();
                    if (r1 <= 0 || c1 <= 0 || r2 <= 0 || c2 <= 0) {
                        System.out.println("Invalid dimensions.");
                        a = null; b = null; break;
                    }
                    a = new int[r1][c1]; b = new int[r2][c2];
                    System.out.println("Enter Matrix A:");
                    for (int i = 0; i < r1; i++) for (int j = 0; j < c1; j++) a[i][j] = sc.nextInt();
                    System.out.println("Enter Matrix B:");
                    for (int i = 0; i < r2; i++) for (int j = 0; j < c2; j++) b[i][j] = sc.nextInt();
                    System.out.println("Matrix A:"); display(a, r1, c1);
                    System.out.println("Matrix B:"); display(b, r2, c2);
                    break;
                case 2:
                    if (a == null || b == null) System.out.println("Create matrices first.");
                    else if (r1 == r2 && c1 == c2) add(a, b, r1, c1);
                    else System.out.println("Addition requires equal dimensions.");
                    break;
                case 3:
                    if (a == null || b == null) System.out.println("Create matrices first.");
                    else if (r1 == r2 && c1 == c2) subtract(a, b, r1, c1);
                    else System.out.println("Subtraction requires equal dimensions.");
                    break;
                case 4:
                    if (a == null || b == null) System.out.println("Create matrices first.");
                    else if (c1 == r2) multiply(a, b, r1, c1, c2);
                    else System.out.println("Multiplication is not possible.");
                    break;
                case 5: System.out.println("Program Terminated!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}