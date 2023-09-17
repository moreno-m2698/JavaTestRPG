
import Entity.MonsterManager;
import Entity.Entity;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Entity player = GameFunctions.GameStart();

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
                while (isPlayerTurn) {
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
                        isPlayerPlaying = false;
                    } else if (playerChoice.equals("2")) {
                        System.out.println("Player has ran from combat");
                        isInEncounter = false;
                    } else if (playerChoice.equals("1")) {
                        System.out.println("Player has attacked!");
                        isPlayerTurn = false;
                    }
                }




            }
        }

        System.out.println("Thank you for playing!");
    }
}