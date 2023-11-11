package MixedStuff;
import java.util.ArrayList;
import java.util.Random;

public class Test {

    public static String[] events = {
            "Начало дня",

            "Поднимаюсь с кровати с левой ноги",

            "Поднимаюсь с кровати с правой ноги",

            "Падаю с кровати",

            "Пробежка по аллее",

            "Физ.зарядка на балконе",

            "Варю крепкий кофе",

            "Готовлю плотный завтрак",

            "Достаю вчерашний салат",

            "Спустило колесо",

            "Добираюсь на работу пешком",

            "Добираюсь на работу на маршрутке",

            "Добираюсь на работу на своем авто",

            "Прихожу вовремя",

            "Опаздываю на работу",

            "Конец"

    };
    public static ArrayList<String> eventLog = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(getEvent());
        chooseEvent(0);
        printEventLog();

    }

    public static void printEventLog() {
        System.out.println(" # | Действие");
        System.out.println("---|------------------------------------");
        for (int i = 0; i < eventLog.size(); i++) {
            System.out.printf(" %2d | %s%n", i + 1, eventLog.get(i));
        }
    }

    public static String getEvent(int max, int min, int event1, int event2) {
        Random rnd = new Random();
        int random = rnd.nextInt(max) + 1;

        if (random <= min) {
            return events[event1];
        } else {
            return events[event2];
        }

    }

    public static void chooseEvent(String event) {
        switch (event) {
            case "Начало дня":
                print(event);
                String nextEvent = getEvent(2, 1, 1, 2);
                chooseEvent(nextEvent);
                break;
            case "Поднимаюсь с кровати с левой ноги":
                print(event);
                chooseEvent(getEvent(10, 7, 3, 4));
                break;
            case "Поднимаюсь с кровати с правой ноги":
                print(event);
                chooseEvent(getEvent(6, 4, 4, 5));
                break;
           
            case "Падаю с кровати":
            case "Пробежка по аллее":
                print(event);
                chooseEvent(getEvent(12, 8, 6, 7));
                break;
            case "Физ.зарядка на балконе":
                print(event);
                chooseEvent(getEvent(4, 1, 7, 8));
                break;
           
            case "Варю крепкий кофе":

            case "Готовлю плотный завтрак":

            case "Достаю вчерашний салат":
                print(event);
                chooseEvent(getEvent(5, 2, 13, 10));
                break;
           
            case "Спустило колесо":
                print(event);
                chooseEvent(getEvent(8, 2, 10, 11));
                break;
            case "Добираюсь на работу на своем авто":
                print(event);
                chooseEvent(getEvent(8, 6, 14, 14));
                break;
            
            case "Добираюсь на работу пешком":
                print(event);
                chooseEvent(getEvent(8, 2, 13, 14));
                break;
            case "Прихожу вовремя", "Опаздываю на работу":
                print(event);
                chooseEvent(getEvent(8, 2, 15, 15)); // спросить помощь
                break;
            case "Добираюсь на работу на маршрутке":
                print(event);
                chooseEvent(getEvent(2, 1, 14, 14));
                break;

        }
    }

    public static void print(String msg) {
        System.out.println(msg);

    }

}