package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void helloAndGetName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String nameOfUser = sc.nextLine();
        System.out.println(String.format("Hello, %s!", nameOfUser));
    }
}
