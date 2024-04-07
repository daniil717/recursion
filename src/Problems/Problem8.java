package Problems;

import java.util.Scanner;

public class Problem8 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = scanner.next();

        if(isDigits(s)){
            System.out.println(s + " Yes");
        }else{
            System.out.println(s + " No");
        }
        scanner.close();
    }

    public static boolean isDigits(String s){
        return s.matches("\\d+");
    }
}
