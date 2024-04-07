package Problems;

import java.util.Scanner;
public class Problem1 {
    public static void solve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array elements:");
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for(int i = 1;i < n;i++){
            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println("Minimum =" +min );
        scanner.close();
    }
}
