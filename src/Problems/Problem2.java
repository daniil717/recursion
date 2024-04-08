package Problems;

import java.util.Scanner;
public class Problem2 {
    public static void solve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements in the array:");
        //Creating an array with a specified number of elements
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array elements:");
        // Loop to fill array elements
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
        //find the sum of all array elements
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += array[i];

        }
        //calculating the average and using "double" for a more accurate answer
        double average = (double) sum / n;

        System.out.println("avarage number:" + average);
        scanner.close();
    }
}
