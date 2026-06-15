import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = rand.nextInt(100) + 1; // 1-100
        int guess;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess the number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println("🎉 Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }

        if (attempts == maxAttempts && secretNumber != 0) {
            System.out.println("Game Over!");
            System.out.println("The secret number was: " + secretNumber);
        }

        sc.close();
    }
}