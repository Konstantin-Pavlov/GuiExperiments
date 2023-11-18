package TreeMapAndTreeSetExamples;

import java.util.*;

/*

https://stepik.org/lesson/98411/step/12?auth=login&unit=74237

Вводится несколько строк по два слова в каждой - имена двух друзей. 
Дружба - вещь взаимная(с двух сторон!!!). Иначе люди - не друзья.
Необходимо вывести ответ в соответствии с примерами ниже - список друзей. 
Список состоит из имен людей, список выстроен в лексографическом порядке(по алфавиту) 
по возрастанию, после имени человека идет фраза " дружит с : ", далее следует список имен его друзей, 
выстроенный так же по возрастанию


Mike Nike
Oleg Petr
Mike Petr
Ivan Oleg

Ivan дружит с : Oleg 
Mike дружит с : Nike Petr 
Nike дружит с : Mike 
Oleg дружит с : Ivan Petr 
Petr дружит с : Mike Oleg 
 * 
 */

public class Friends {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> names = new TreeMap<>();
        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            String name1 = line[0];
            String name2 = line[1];

            namesListUpdate(name1, name2, names);

        }
        for (Map.Entry<String, TreeSet<String>> pair : names.entrySet()) {
            System.out.print(pair.getKey() + " дружит с : ");
            pair.getValue().forEach(elemnt -> System.out.print(elemnt + " "));
            System.out.println();
        }

        scanner.close();
    }

    private static void namesListUpdate(String name1, String name2, TreeMap<String, TreeSet<String>> names) {
        // if (names.containsKey(name1)) {
        //     names.get(name1).add(name2);
        // } else {
        //     names.put(name1, new TreeSet<>(Collections.singletonList(name2)));
        // }
        // int value1 = map.computeIfAbsent("key1", k -> 20); // Key already present, returns 10
        // int value2 = map.computeIfAbsent("key2", k -> 30); // Key not present, computes value as 30

        names.computeIfAbsent(name1, k -> new TreeSet<>(Collections.singletonList(name2))).add(name2);
        names.computeIfAbsent(name2, k -> new TreeSet<>(Collections.singletonList(name1))).add(name1);


        // if (names.containsKey(name2)) {
        //     names.get(name2).add(name1);
        // } else {
        //     names.put(name2, new TreeSet<>(Collections.singletonList(name1)));
        // }
    }

}
