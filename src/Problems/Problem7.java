package Problems;

import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        reverseArray(array, 0, n - 1);
        System.out.println("reverse array:");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }

    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end)
            return;
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start + 1, end - 1);
    }
}
