package Elevator;

import java.util.Scanner;

public class Application {
    static int exitStatus = 0;

    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        Scanner scanner = new Scanner(System.in);
        while (exitStatus != -1) {
            moveAction(elevator, scanner);
        }
        scanner.close();

    }

    private static void moveAction(Elevator elevator, Scanner sc) {
        print("Нажмите -1 чтобы выйти из лифта или выберите этаж назначения (1-18):");
        int floor = Integer.parseInt(askUser(sc));
        if (floor == -1) {
            exitStatus = -1;
            return;
        }
        if (!elevator.isAllowableFloor(floor)) {
            print("Недопустимый этаж");
            return;
        }
        print("Укажите перевозимый вес:");
        int weight = Integer.parseInt(askUser(sc));

        if (!elevator.isAllowableWeight(weight)) {
            print("Недопустимый вес");
            return;
        }

        elevator.move(floor);
        print("=======================");
    }

    private static String askUser(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}
