package Problems;

import java.util.Scanner;
public class Problem1 {
    //method for solving the problem
    public static void solve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements in the array:");
        //Reading the number of array elements
        int n = scanner.nextInt();
        //Creating an array with a specified number of elements
        int[] array = new int[n];
        System.out.println("array elements:");
        //loop to fill our array with elements
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }

        // Finding the minimum value in the array
        int min = array[0];//take the minimum element as the first
        for(int i = 1;i < n;i++){
            //if the current element is less than the minimum then replace the minimum with the current one
            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println("Minimum =" +min );
        scanner.close();
    }
}
