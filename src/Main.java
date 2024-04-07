import java.util.Scanner;
import Problems.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose the number of task:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Problem1.solve();
                    break;
                case 2:
                    Problem2.solve();
                    break;
                case 3:
                    Problem3.solve();
                    break;
                case 4:
                    Problem4.solve();
                    break;
                case 5:
                    Problem5.solve();
                    break;
                case 6:
                    Problem6.solve();
                    break;
                case 7:
                    Problem7.solve();
                    break;
                case 8:
                    Problem8.solve();
                    break;
                case 9:
                    Problem9.solve();
                    break;
                case 10:
                    Problem10.solve();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            running = false;
        }
        scanner.close();
    }
}


