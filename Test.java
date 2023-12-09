import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // System.out.println(reverse(123456));
        Cat[] cats = Stream.generate(Cat::new).limit(5).toArray(Cat[]::new);

        Stream.of(cats).forEach(System.out::println);
        int n = 2;
       

    }

    private static int reverse(int x) {
        // Integer i = Integer.parseInt(String.valueOf(new StringBuilder(x).reverse()));
        int sign = (int) Math.signum(x);
        long absValue = Math.abs((long) x);
        StringBuilder sb = new StringBuilder(String.valueOf(absValue)).reverse();
        // System.out.println(sb);
        long l = Long.parseLong(sb.toString()) * sign;
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) l;
    }

    static void sort(int[] a) {
        // your code
        java.util.Arrays.sort(a);
    }

}

class Cat {
    String name;
    int age, weight;
}
