package Problems;

import java.util.Scanner;
public class Problem4 {
    public static void solve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        //find out the number for which you need to find the factorial
        int n = scanner.nextInt();
        //display the result
        System.out.println("Answer:" + factorial(n));
        scanner.close();
    }

    // Method for calculating the factorial of the number n
    public static int factorial(int n){
        //factorial 0 is 1
        if(n == 0){
            return 1;
            //the factorial of n is equal to n times the factorial (n-1)
        }else{
            return n * factorial(n - 1);
        }
    }
}
