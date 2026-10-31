import java.util.Scanner;

public class StringArrayProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        String longest = arr[0];
        String shortest = arr[0];

        System.out.println("\nAll Strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            if (arr[i].length() > longest.length()) longest = arr[i];
            if (arr[i].length() < shortest.length()) shortest = arr[i];
        }

        System.out.println("\nLongest String: " + longest);
        System.out.println("Shortest String: " + shortest);
        System.out.println("\nStrings in Reverse Order:");
        for (int i = n - 1; i >= 0; i--) System.out.println(arr[i]);
        sc.close();
    }
}