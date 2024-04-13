package Problems;

import java.util.Scanner;
public class Problem11 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your word:");
        String word = scanner.nextLine();

        System.out.println("Your letter:");
        char letter = (char) scanner.nextInt();

        System.out.println("Answer is " + countOccurrence(word, letter));

    }

    public static int countOccurrence(String word, char letter) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;
            } else {
                continue;
            }
        }
        return counter;
    }
}
