package Problems;

import java.util.Scanner;
public class Problem7 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array elements:");

        //Loop to fill an array with elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the method to reverse the array
        reverseArray(array, 0, n - 1);
        System.out.println("reverse array:");

        //loop to output elements from an array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }

    // Method for reversing the array
    public static void reverseArray(int[] array, int start, int end) {
        //if the starting index is greater than or equal to the ending index, return
        if (start >= end)
            return;
        // Exchange values between the start and end elements of the array
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        // Recursive call for next array elements
        reverseArray(array, start + 1, end - 1);
    }
}
