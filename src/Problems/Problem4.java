package Problems;

import java.util.Scanner;
public class Problem4 {
    public static void solve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scanner.nextInt();
        System.out.println("Answer:" + factorial(n));
        scanner.close();
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
