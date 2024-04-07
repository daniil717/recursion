package Problems;

import java.util.Scanner;

public class Problem10 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number a and b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("answer:" + gcd(a,b));
        scanner.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
