package poker;

import java.util.Arrays;
import java.util.Random;

public class Game {
    public static Random random = new Random();

    public static void main(String[] args) {

        String[] ranks = new String[13];
        Suit[] suits = new Suit[] { Suit.HEARTS, Suit.PIKES, Suit.CLOVES, Suit.TILES };

        fillingTheRanksArray(ranks);
        Card card1 = getRandomCard(ranks, suits);
        System.out.println(card1);
    }

    private static Card getRandomCard(String[] ranks, Suit[] suits) {
        int rankChoice = random.nextInt(13);
        int suitChoice = random.nextInt(4);
        return new Card(suits[suitChoice], ranks[rankChoice]);
    }

    private static void fillingTheRanksArray(String[] ranks) {
        for (int i = 0; i < ranks.length; i++) {
            int choice = random.nextInt(13);
            switch (choice) {
                case 0:
                    ranks[i] = "2";
                    break;
                case 1:
                    ranks[i] = "3";
                    break;
                case 2:
                    ranks[i] = "4";
                    break;
                case 3:
                    ranks[i] = "5";
                    break;
                case 4:
                    ranks[i] = "6";
                    break;
                case 5:
                    ranks[i] = "7";
                    break;
                case 6:
                    ranks[i] = "8";
                    break;
                case 7:
                    ranks[i] = "9";
                    break;
                case 8:
                    ranks[i] = "10";
                    break;
                case 9:
                    ranks[i] = "J";
                    break;
                case 10:
                    ranks[i] = "Q";
                    break;
                case 11:
                    ranks[i] = "K";
                    break;
                case 12:
                    ranks[i] = "A";
                    break;
                default:
                    System.out.println("ошибка");
            }
        }
    }

}
