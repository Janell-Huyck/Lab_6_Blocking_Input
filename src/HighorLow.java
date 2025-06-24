import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        int random_number = 0;
        int guess = 0;
        String trash = "";
        boolean valid_input = false;
        Scanner in = new Scanner(System.in);

        Random generator = new Random();
        random_number = generator.nextInt(10) + 1;

        do {
            System.out.print("Guess an integer between 1 and 10 (inclusive): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess < 1 || guess > 10) {
                    System.out.println(guess + " is not a valid input. Guess must be between 1 and 10.");
                } else {
                    valid_input = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + " is not a valid integer.");
            }
        } while (!valid_input);

        if (guess == random_number) {
            System.out.println("The number was " + random_number + ". You guessed the number correctly!");
        } else if (guess > random_number) {
            System.out.println("The number was " + random_number + ". Your guess was too high. Better luck next time.");
        } else {
            System.out.println("The number was " + random_number + ". Your guess was too low. Better luck next time.");
        }
    }
}
