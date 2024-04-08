import java.util.Scanner;
import Problems.*;

public class Main {
    public static void main(String[] args) {
        //create an object to contain users input
        Scanner scanner = new Scanner(System.in);
        //running for tracking the program's performance
        boolean running = true;

        while (running) {
            System.out.println("Choose the number of task:");
            //contain users choice
            int choice = scanner.nextInt();

            /*Selecting a task depending on the entered number
            performing each task depending on its number*/
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
                    //if input is not 1 - 10 print "Invalid choice"
                default:
                    System.out.println("Invalid choice");
            }
            //shutting down the program after completing the selected task
            running = false;
        }
        //To avoid resource leakage, close Scanner
        scanner.close();
    }
}


