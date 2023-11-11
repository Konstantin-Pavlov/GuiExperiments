package TV;

import java.util.Scanner;

public class Main {
    static int exitStatus = 1;

    public static void main(String[] args) {
        Television tv = new Television(1, 10);
        Scanner scanner = new Scanner(System.in);

        print(tv.printChannel());
        while (exitStatus != 0) {
            chooseAction(tv, scanner);
        }
        scanner.close();
    }

    private static void chooseAction(Television tv, Scanner sc) {
        String msg = "Выберите действие:\n" +
                "\t0 - Выключить телевизор;\n" +
                "\t1 - Переключиться на следующий канал;\n" +
                "\t2 - Переключиться на предыдущий канал;\n" +
                "\t3 - Переключиться на канал по номеру;";
        print(msg);
        String answer = askUser(sc);

        switch (answer) {
            case "0":
                System.out.println("\n" +
                        "\t.............Выключение.............\n" +
                        "\n");
                exitStatus = 0;
                break;
            case "1":
                tv.nextChannel();
                print(tv.printChannel());
                break;
            case "2":
                tv.prevChannel();
                print(tv.printChannel());
                break;
            case "3":
                int channel = getChannelNumber(sc);
                tv.toChannel(channel);
                print(tv.printChannel());
                break;
            default:
                print("Введен некорректный символ. Такая команда неизвестна.");
        }
    }

    private static int getChannelNumber(Scanner sc) {
        print("Введите номер канала:");
        String channel = askUser(sc);
        return Integer.parseInt(channel);
    }

    private static String askUser(Scanner s) {
        return s.nextLine();
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}