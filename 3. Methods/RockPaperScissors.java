import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock Paper Scissors game!");
        String playerChoice = getPlayerChoice();
        if (playerChoice.equals("q")) {
            System.out.println("Goodbye!");
            return;
        }

        String computerChoice = getComputerChoice();

        System.out.println("Player: " + playerChoice);
        System.out.println("Computer: " + computerChoice);
        System.out.println("You " + getWinner(playerChoice, computerChoice) + ".");
    }

    public static String getComputerChoice() {
        // Get random number from 1-3
        int num = (int) (Math.random() * 3) + 1;
        String choice;

        switch (num) {
            case 1:
                choice = "rock";
                break;
            case 2:
                choice = "paper";
                break;
            default:
                choice = "scissors";
        }

        return choice;
    }

    public static String getPlayerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'rock', 'paper', 'scissors'. Enter anything else to quit: ");
        String input = sc.nextLine();

        if (input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
            return input;
        } else {
            return "q";
        }
    }

    public static String getWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "tied";
        }

        String result;
        switch (playerChoice) {
            case "rock":
                if (computerChoice.equals("paper")) {
                    result = "lost";
                } else {
                    result = "won";
                }
                break;
            case "paper":
                if (computerChoice.equals("rock")) {
                    result = "won";
                } else {
                    result = "lost";
                }
                break;
            default:
                if (computerChoice.equals("paper")) {
                    result = "won";
                } else {
                    result = "lost";
                }
        }
        return result;
    }
}
