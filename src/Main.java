// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
                System.out.println("did not pick valid class");
                System.out.println("Please select a class by typing in its name: MAGE, KNIGHT");
                heroClass = sc.next();
            } else {
                System.out.println("Congrats picked valid class");
                isInputCorrect = true;
            }
        }

        System.out.println("You made it out of the loop");




        boolean isPlayerTurn = true;
        boolean isInEncounter = false;

    }
}