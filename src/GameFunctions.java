import java.util.Scanner;

public class GameFunctions {


    public static String HeroInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple demo created for the purposes of learning Java.");
        System.out.println("Welcome to my RPG.");
        System.out.println("Welcome please select a class by typing in its name: MAGE, KNIGHT");
        String heroClass = sc.next();
        System.out.println("You entered: " + heroClass);
        return heroClass;
    }
}
