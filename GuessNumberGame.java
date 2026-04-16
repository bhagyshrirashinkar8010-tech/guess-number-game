import java.util.*;

public class GuessNumberGame {

    // Method to generate a random number between 1 and 100
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;  // Generate a random number between 1 and 100
    }

    // Method to give a hint based on the user's guess
   public static String giveHint(int number, int guess) {
    int diff = Math.abs(number - guess);

    if (guess == number) {
        return "Right";
    } else if (diff <= 10) {
        return "Hot";
    } else {
        return "Cold";
    }
}
    // Method to run the guessing game
    public static void runGuess() {
        int secretNumber = getRandomNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 100: ");
        int userGuess = scanner.nextInt();

        String hint = giveHint(secretNumber, userGuess);
        if (hint.equals("Right")) {
            System.out.println("You guessed it Right!");
        } else {
            System.out.println(hint);
        }

        scanner.close();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        runGuess();
    }
}
