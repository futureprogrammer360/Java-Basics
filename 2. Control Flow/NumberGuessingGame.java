import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate the random number
        int num = (int) (Math.random() * 10 + 1);

        int guess;
        int numGuesses = 3;

        while (numGuesses > 0) {
            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();

            if (guess == num) {
                System.out.println("Congratulations! You got the number, which is " + num);
                break;
            } else if (guess < num) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

            numGuesses--;

            if (numGuesses == 0) {
                System.out.println("You ran out of guesses, the number was " + num);
            }
        }
    }
}
