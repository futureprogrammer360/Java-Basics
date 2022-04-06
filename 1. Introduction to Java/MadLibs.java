import java.util.Scanner;

class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.print("Enter a type of animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = sc.nextLine();
        System.out.print("Enter another adjective: ");
        String adjective2 = sc.nextLine();

        System.out.println("The tale of a programmer...");

        System.out.println(name + " is a Java programmer. One day when " + name + " was writing a few " + adjective1 + " programs, the doorbell rang. Outside stood a very " + adjective2 + " " + animal + ". The " + animal + " lunged for " + name + ", who threw the closest thing nearby - a computer - towards the " + animal + ". " + name + " missed, but the " + animal + " was scared enough to leave " + name + "'s house. The end.");
    }
}
