import java.util.Scanner;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to a game of choose your own adventure!");

        System.out.print("You are walking in the forest. You see a small cabin on the side of the road. Would you like to go in (y/n)? ");
        choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.print("You went into the cabin on the side of the road. Nobody is inside, but there is a ladder that goes to the attic. Do you want to go up (y/n)? ");
            choice = sc.nextLine();
            if (choice.equals("y")) {
                System.out.println("You went up the ladder and reached the attic. You found a box full of treasure. Congratulations! You won the game.");
            } else {
                System.out.println("You left the cabin and continued wandering in the forest. You couldn't find a source of water and soon enough, you died 😭");
            }
        } else {
            System.out.print("You continued walking down the road in the forest. Suddenly, a monster jumped out of the trees. Do you want to fight the monster (y/n)? ");
            choice = sc.nextLine();
            if (choice.equals("y")) {
                System.out.println("You fought the monster with your bare hands bravely, but you still died. The end.");
            } else {
                System.out.println("You ran away, but the monster chased you down and ate you. :(");
            }
        }
    }
}
