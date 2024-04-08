package Problems;

import java.util.Scanner;

public class Problem6 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers a and n:");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        //the result of raising the number a to the power n
        System.out.println("answer: " + power(a,n));
    }
    //Method for calculating the power of a number
    public static int power(int a, int n) {
        //any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        //Recursion to calculate the power of a to the power of n
        else {
            return a * power(a, n - 1);
        }
    }
}