import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static Random rnd = new Random();
    public static char[] encodedWord;
    public static int point = 0;
    public static int attempts = 3;
    public static String[] usedWords = new String[9];

    public static void main(String[] args) {

        round(1);
        round(2);
        round(3);
    }

    public static void round(int roundNumber) {
        System.out.println("round " + roundNumber + " begins");
        attempts = 3;
        String[] words = selectCategory();
        String word = selectWord(words);
        print(word);
        getEncodedWord(word);
        print(Arrays.toString(encodedWord));

        while (checkEncodedWord() && attempts > 0) {
            char letter = chooseLetter();
            if (replaceLetterInEncodedWord(letter, word)) {
                print("Letter is not present");
                attempts--;
            } else {
                attempts = 3;
            }

            print(Arrays.toString(encodedWord));
        }
        if (attempts == 0) {
            System.out.println("no attempts left");
        }
        print("round " + roundNumber + " End");
        print("Word: " + word);
        print("Score: " + point);
        System.out.println();
        System.out.println("**************************");
        System.out.println();
    }

    public static String[] selectCategory() {
        String[] categories = { "Animals", "Cities", "Fruits" };

        switch (rnd.nextInt(categories.length)) {
            case 0:

                print("Category: " + categories[0]);
                return new String[] { "Elephant", "Cat", "Giraffe" };
            case 1:

                print("Category: " + categories[1]);
                return new String[] { "Moscow", "Rio", "Bishkek" };
            case 2:
            default:

                print("Category: " + categories[2]);
                return new String[] { "Banana", "Apple", "Mango" };
        }

    }

    public static String selectWord(String[] words) {
        boolean notUniqWord = true;
        String tempWord = "";
        
        while (notUniqWord) {
            boolean found = false;
            tempWord  = words[rnd.nextInt(words.length)];
            for (String  w : usedWords) {
                if(tempWord.equalsIgnoreCase(w)){
                    found = true;
                    break;
                }
            }
            if (!found){
                notUniqWord = false;
            }
        }
        return tempWord;
    }

    public static void getEncodedWord(String word) {
        encodedWord = new char[word.length()];

        Arrays.fill(encodedWord, '*');
    }

    public static char chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        String str;

        while (true) {
            print("Enter letter:");
            str = scanner.nextLine();
            if (str.length() > 1) {
                print("Enter only single letter. Try again.");
                continue;
            }
            if (!str.isEmpty()) {
                break;
            }
            print("Letter can not be empty. Try again.");
        }
        return str.charAt(0);
    }

    public static boolean replaceLetterInEncodedWord(char letter, String word) {
        String str = String.valueOf(letter);
        boolean bool = true;
        for (int i = 0; i < word.length(); i++) {
            if (str.equalsIgnoreCase(String.valueOf(word.charAt(i)))) {
                encodedWord[i] = word.charAt(i);
                bool = false;
                point++;
            }
        }
        return bool;
    }

    public static boolean checkEncodedWord() {
        for (char c : encodedWord) {
            if (c == '*') {
                return true;
            }
        }
        return false;
    }

    public static void print(String message) {
        System.out.println(message);
    }
}