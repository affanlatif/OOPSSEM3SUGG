import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            System.out.println("Fibonacci Series:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}