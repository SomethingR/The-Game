import java.util.Scanner;

public class TitleScreenCredits {
    static Scanner time = new Scanner(System.in);

    private static int titleChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Start Game");
        System.out.println("Instructions");
        System.out.println("Credits");
        int choice = input.nextInt();
        return (choice);
    }

    private static void instructions() {
        System.out.println("Press any number and then enter to advance.");
        time.nextInt();
    }

    private static void credits() {
        System.out.println("Text Based sudoGame by RobM");
        time.nextInt();
    }

    public static void titleRun() {
        switch (titleChoice()) {
            case 1:
                MainClass.game();
                break;
            case 2:
                instructions();
                titleRun();
                break;
            case 3:
                credits();
                titleRun();
                break;
            default:
                titleRun();
                break;
        }
    }
}