package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int numberOfGame = sc.nextInt();
        System.out.printf("Your choice: %d%n", numberOfGame);

        switch (numberOfGame) {
            case 1:
                Cli.helloAndGetName();
                break;
            case 2:
                String nameUser = Cli.helloAndGetName();
                EvenGame.getAnswer(nameUser);
                break;
            default:
                System.out.println("Такой игры нет");
        }
    }
}
