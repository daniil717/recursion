package Problems;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers a and n:");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("answer: " + power(a,n));
    }
    public static int power(int a, int n) {
        if (n == 0)
            return 1;
        else
            return a * power(a, n - 1);
    }
}