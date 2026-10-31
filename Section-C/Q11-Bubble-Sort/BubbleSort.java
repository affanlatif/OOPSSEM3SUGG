import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 elements:");
        for (int i = 0; i < 6; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        System.out.println("Sorted Array:");
        for (int i = 0; i < 6; i++) System.out.print(arr[i] + " ");
        sc.close();
    }
}