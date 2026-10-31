import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos >= 0 && pos < str.length())
            System.out.println("Character: " + str.charAt(pos));
        else
            System.out.println("Invalid position.");

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start <= end)
            System.out.println("Substring: " + str.substring(start, end));
        else
            System.out.println("Invalid substring positions.");
        sc.close();
    }
}