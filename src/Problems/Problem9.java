package Problems;

import java.util.Scanner;

public class Problem9 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n and k:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("Answer:" + binomialCoefficient(n, k));
        scanner.close();
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
