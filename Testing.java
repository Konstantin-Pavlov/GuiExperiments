import java.util.*;
/*
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

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> names = new TreeMap<>();
        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            String name1 = line[0];
            String name2 = line[1];

            // to method?
            if (names.containsKey(name1)) {
                names.get(name1).add(name2);
            } else {
                names.put(name1, new TreeSet<>(Collections.singletonList(name2)));
            }

            if (names.containsKey(name2)) {
                names.get(name2).add(name1);
            } else {
                names.put(name2, new TreeSet<>(Collections.singletonList(name1)));
            }
        }
        for (Map.Entry<String, TreeSet<String>> pair : names.entrySet()) {
            System.out.print(pair.getKey() + " дружит с : ");
            pair.getValue().forEach(elemnt -> System.out.print(elemnt + " "));
            System.out.println();
        }

        scanner.close();
}

    private static int reverse(int x) {
//        Integer i = Integer.parseInt(String.valueOf(new StringBuilder(x).reverse()));
        int sign = (int) Math.signum(x);
        long absValue = Math.abs((long) x);
        StringBuilder sb = new StringBuilder(String.valueOf(absValue)).reverse();
//        System.out.println(sb);
        long l = Long.parseLong(sb.toString()) * sign;
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) l;
    }

    static void sort(int[] a) {
        //your code
        java.util.Arrays.sort(a);
    }

}


