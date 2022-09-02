import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Please guess a number");

        Scanner scanner = new Scanner(System.in);

        boolean continueGuess = true;

        int count = 0;
        while (continueGuess) {
            int guess = scanner.nextInt();
            count++;
            if (guess == number) {
                System.out.println("You have won");
                continueGuess = false;
            } else if (guess < number) {
                System.out.println("Your guess is less than actual number");
            } else {
                System.out.println("Your guess is  more than actual number");
            }
        }
        System.out.println("Your guess for " + count + " trying");
    }
}
