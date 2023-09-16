// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String heroClass = GameFunctions.HeroInput();

        if (!heroClass.equalsIgnoreCase("MAGE") && !heroClass.equalsIgnoreCase("KNIGHT")) {
            System.out.println("did not pick valid class");
        }
        else {
            System.out.println("Congrats picked valid class");
        }




        boolean isPlayerTurn = true;
        boolean isInEncounter = false;

    }
}