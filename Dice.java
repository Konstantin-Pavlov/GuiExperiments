import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        round(1);
        round(2);
        round(3);
        scanner.close();
    }

    private static void round(int i) {

        System.out.println("Start game. Round " + i);
        System.out.print("Predict amount of points (2..12): ");
        int predicted = scanner.nextInt();

        int dice1 = rollTheDice(random);
        int dice2 = rollTheDice(random);

        System.out.println("User rolls the dices.");
        printDice(dice1);
        printDice(dice2);

        System.out.println("Computer's turn");
        int computerPrediction = random.nextInt(11) + 2;
        System.out.println("Computer predicted: " + computerPrediction + " points.");
        int computerDice1 = rollTheDice(random);
        int computerDice2 = rollTheDice(random);
        System.out.println("Computer rolls the dices.");
        printDice(computerDice1);
        printDice(computerDice2);

        int computerPoints = computerDice1 + computerDice2;
        int computerScore = calculateScore(computerPoints, computerPrediction);
        int calculateScore = calculateScore(computerPoints, computerPrediction);
        System.out.println("Computer's result: " + computerPoints + " points.");

        int points = dice1 + dice2;
        System.out.println("On the dice fell " + points + " points.");
        int score = calculateScore(points, predicted);
        System.out
                .println("Result is " + points + "-abs(" + points + " - " + predicted + ") * 2: " + score + " points");

        if (score > 0) {
            System.out.println("User wins!");
        } else {
            System.out.println("User loses!");
        }

        System.out.println("Player's final score: " + calculateScore);
        System.out.println("Computer's final score: " + computerScore);
        if (calculateScore > computerScore) {
            System.out.println("Player wins by " + (calculateScore - computerScore) + " points!");
        } else if (computerScore > calculateScore) {
            System.out.println("Computer wins by " + (computerScore - calculateScore) + " points!");
        } else {
            System.out.println("It's a tie!");
        }

        System.out.println("End of round " + i);
        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        
    }

    private static int rollTheDice(Random random) {
        return random.nextInt(6) + 1;
    }

    private static void printDice(int value) {
        String[] diceFaces = getDiceFace(value);
        for (String line : diceFaces) {
            System.out.println(line);
        }
    }

    private static int calculateScore(int points, int predicted) {
        return points - Math.abs(points - predicted) * 2;
    }

    private static String[] getDiceFace(int value) {
        switch (value) {
            case 1:
                return new String[] {
                        "-------",
                        "|     |",
                        "|  *  |",
                        "|     |",
                        "-------"
                };
            case 2:
                return new String[] {
                        "-------",
                        "| *   |",
                        "|     |",
                        "|   * |",
                        "-------"
                };
            case 3:
                return new String[] {
                        "-------",
                        "| *   |",
                        "|  *  |",
                        "|   * |",
                        "-------"
                };
            case 4:
                return new String[] {
                        "-------",
                        "| * * |",
                        "|     |",
                        "| * * |",
                        "-------"
                };
            case 5:
                return new String[] {
                        "-------",
                        "| * * |",
                        "|  *  |",
                        "| * * |",
                        "-------"
                };
            case 6:
                return new String[] {
                        "-------",
                        "| * * |",
                        "| * * |",
                        "| * * |",
                        "-------"
                };
            default:
                return new String[] {};
        }
    }
}