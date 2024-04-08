package Problems;

import java.util.Scanner;
public class Problem3 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();

        if(isPrime(number)){
            System.out.println(number + " Prime");
        }else{
            System.out.println(number + " Composite");
        scanner.close();
        }
    }
    //method to check whether a number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        //Calling a helper method to recursively test a number for primality
        return isPrimeUtil(n, 2);
    }

    //a helper method to recursively test a number for primality
    private static boolean isPrimeUtil(int n, int i) {
        if (i == n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        //checking division by next number using recursive call
        return isPrimeUtil(n, i + 1);
    }
}