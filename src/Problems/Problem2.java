package Problems;

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array elements:");
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += array[i];

        }
        double average = (double) sum / n;

        System.out.println("avarage number:" + average);
        scanner.close();
    }
}
