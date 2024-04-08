package Problems;

import java.util.Scanner;

public class Problem5 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter item number:");
        int n = scanner.nextInt();
        System.out.println("F"+n+" = " + fibonacci(n));
        scanner.close();
    }

    //calculate the values of the Fibonacci sequence element using the method
    public static int fibonacci(int n) {
        //if n is less than or equal to 1, return n
        if (n <= 1) {
            return n;
        } else {
            //calculating the Fibonacci number value for n using recursion
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}