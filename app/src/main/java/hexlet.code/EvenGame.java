package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    static int correctAnswers = 0;

    public static void getAnswer(String nameUser) {
        Scanner sc = new Scanner(System.in);
        boolean isFail = false;
        while (!isFail && correctAnswers != 3) {
            Random random = new Random();
            int number = random.nextInt(0, 100);

            System.out.printf("Question: %d%n", number);
            String answer = sc.nextLine();
            System.out.printf("Your answer: %s%n", answer);

            boolean isEven = number % 2 == 0;
            String rightAnswer = isEven ? "yes" : "no";

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", answer, rightAnswer, nameUser);
                isFail = true;
            }
        }

        if (correctAnswers == 3) {
            System.out.printf("Congratulations, %s!%n", nameUser);
        }
    }
}
