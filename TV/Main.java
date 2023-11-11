package tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television(1, 10);
        print(tv.printChannel());
        while (true) {
            chooseAction(tv);
        }
    }

    private static void chooseAction(Television tv) {
        String msg = "Выберите действие:\n" +
                "\t1 - Переключиться на следующий канал;\n" +
                "\t2 - Переключиться на предыдущий канал;\n" +
                "\t3 - Переключиться на канал по номеру;";
        print(msg);
        String answer = askUser();

        switch (answer) {
            case "1":
                tv.nextChannel();
                print(tv.printChannel());
                break;
            case "2":
                tv.prevChannel();
                print(tv.printChannel());
                break;
            case "3":
                int channel = getChannelNumber();
                tv.toChannel(channel);
                print(tv.printChannel());
                break;
            default:
                print("Введен некорректный символ. Такая команда неизвестна.");
        }
    }

    private static int getChannelNumber() {
        print("Введите номер канала:");
        String channel = askUser();
        return Integer.parseInt(channel);
    }

    private static String askUser() {
        return new Scanner(System.in).nextLine();
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}