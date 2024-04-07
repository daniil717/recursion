package Problems;

import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
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
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        return isPrimeUtil(n, 2);
    }

    private static boolean isPrimeUtil(int n, int i) {
        if (i == n)
            return true;
        if (n % i == 0)
            return false;
        return isPrimeUtil(n, i + 1);
    }
}