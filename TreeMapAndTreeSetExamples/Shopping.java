package TreeMapAndTreeSetExamples;

/* 

https://stepik.org/lesson/98411/step/13?auth=login&unit=74237

В магазине внедрили автоматизированную систему анализа покупок покупателей. 
В 2020 году наличные деньги были отменены и все платежи стали открытыми. 
Каждый магазин в момент платежа получает от покупателя его Фамилию и Имя, 
а так же список его покупок в формате Наименование товара и сумма покупки.

Например:

Иванов Иван:

    селедка 7
    помидоры 120
    огурцы 110
    устрицы 32
    омары 36
    лобстер 45

Программа получает на вход строки в следующем формате: Фамилия пробел Имя пробел Наименование товара пробел сумма.
Система формирует отчет за месяц, в котором информация обо всех покупателях и обо всех покупках для каждого покупателя.
Покупатели отсортированы по алфавиту, покупки отсортированы по наименованию по алфавиту, в пределах конкретного покупателя.
Внимательно посмотрите на примеры! Если не понятно - оставляйте свои вопросы в комментариях.
На выводе, перед каждым продуктом ставится 4 пробела!

Sample Input 1:
Иванов Иван селедка 7
Иванов Иван помидоры 120
Иванов Иван огурцы 110
Иванов Иван устрицы 32
Иванов Иван омары 36
Иванов Иван лобстер 45
Петров Петр хлеб 2
Билл Гейтс вода 10000
Sample Output 1:
Билл Гейтс: 
    вода 10000
Иванов Иван: 
    лобстер 45
    огурцы 110
    омары 36
    помидоры 120
    селедка 7
    устрицы 32
Петров Петр: 
    хлеб 2

*/

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> namesAndPurchases = new TreeMap<>();

        // example of TreeSet initialization with data
        // TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Tom", "Fred","Mary"));

        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            String name = line[0] + " " + line[1];
            String purchaseAndPrice = line[2] + " " + line[3];
            System.out.println(name + " " + purchaseAndPrice);
            namesAndPurchasesListUpdate(name, purchaseAndPrice, namesAndPurchases);
        }

        for (Map.Entry<String, TreeSet<String>> pair : namesAndPurchases.entrySet()) {
            System.out.println(pair.getKey() + ": ");
            pair.getValue().forEach(elemnt -> System.out.println("    " + elemnt));
        }

        scanner.close();

    }

    private static void namesAndPurchasesListUpdate(String name, String purchaseAndPrice,
            TreeMap<String, TreeSet<String>> namesAndPurchases) {
        if (namesAndPurchases.containsKey(name)) {
            namesAndPurchases.get(name).add(purchaseAndPrice);
        } else {
            namesAndPurchases.put(name, new TreeSet<>(Collections.singletonList(purchaseAndPrice)));
        }
    }
}
