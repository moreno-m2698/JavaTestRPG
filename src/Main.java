
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple demo created for the purposes of learning Java.");
        System.out.println("Welcome to my RPG.");
        System.out.println("Welcome please select a class by typing in its name: MAGE, KNIGHT");
        String heroClass = sc.next();
        System.out.println("You entered: " + heroClass);

        boolean isInputCorrect = false;
        while (!isInputCorrect) {
            if (!heroClass.equalsIgnoreCase("MAGE") && !heroClass.equalsIgnoreCase("KNIGHT")) {
                System.out.println("Please select a class by typing in its name: MAGE, KNIGHT");
                heroClass = sc.next();
            } else {
                String confirmationString = String.format("You've chosen to play as a %s", heroClass); /* Will need
                to put a ToUpper outside later by holding this as a string */
                System.out.println(confirmationString);
                isInputCorrect = true;
            }
        }

        boolean isPlayerTurn = true;
        boolean isInEncounter = false;
        boolean isPlayerPlaying = true;

        while(isPlayerPlaying) {
            String enemy = "Slime";
            String encounterString = String.format("A wild %s approaches you", enemy);
            isInEncounter=true;
            System.out.println(encounterString);
            while (isInEncounter) {
                isPlayerTurn = true;
                System.out.println("Choose an action:");
                System.out.println("1. Attack");
                System.out.println("2. Run");
                System.out.println("3. Quit Game");
                String playerChoice = sc.next();
                if (!playerChoice.equals("1") && !playerChoice.equals("2") && !playerChoice.equals("3")) {
                    System.out.println("Please select a valid action");
                } else if (playerChoice.equals("3")) {
                    System.out.println("Closing Game...");
                    isInEncounter = false;
                    isPlayerPlaying=false;
                } else if (playerChoice.equals("2")) {
                    System.out.println("Player has ran from combat");
                    isInEncounter = false;
                } else if (playerChoice.equals("1")) {
                    System.out.println("Player has attacked!");
                }



            }
        }

        System.out.println("Thank you for playing!");
    }
}