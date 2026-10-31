import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
        } else {
            int[] count = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }

            boolean isAnagram = true;
            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            System.out.println(isAnagram ? "Strings are anagrams." : "Strings are not anagrams.");
        }
        sc.close();
    }
}