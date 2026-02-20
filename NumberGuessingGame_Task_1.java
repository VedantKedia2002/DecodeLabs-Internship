import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame_Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int totalRounds = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
            totalRounds++;
            int number = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Limit to 10 attempts

            System.out.println("Round " + totalRounds + ": I'm thinking of a number between 1 and 100.");

            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Game over! You played " + totalRounds + " rounds with a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
}