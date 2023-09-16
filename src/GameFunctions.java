import Entity.Entity;
import Entity.HeroClassManager;
import java.util.Scanner;

public class GameFunctions {

    public static Entity GameStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple demo created for the purposes of learning Java.");
        System.out.println("Welcome to my RPG.");
        System.out.println("Welcome please select a class by typing in its name: MAGE, KNIGHT");
        String heroClass = sc.next();
        System.out.println("You entered: " + heroClass);

        Entity player = new Entity();

        boolean isInputCorrect = false;

        while (!isInputCorrect) {
            if (!heroClass.equalsIgnoreCase("MAGE") && !heroClass.equalsIgnoreCase("KNIGHT")) {
                System.out.println("Please select a class by typing in its name: MAGE, KNIGHT");
                heroClass = sc.next();
            } else {
                isInputCorrect = true;
                String confirmationString = String.format("You've chosen to play as a %s", heroClass); /* Will need
                to put a ToUpper outside later by holding this as a string */
                System.out.println(confirmationString);
                if (heroClass.equalsIgnoreCase("MAGE")) {
                    player = HeroClassManager.MAGE;
                } else {
                    player = HeroClassManager.KNIGHT;
                }

            }
        }

        return player;
    }
}
