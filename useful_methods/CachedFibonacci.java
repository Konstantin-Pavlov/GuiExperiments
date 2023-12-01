package useful_methods;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CachedFibonacci {
    private static Map<Long, BigInteger> cash = new HashMap<>();

    public static void main(String[] args) {
        // run();
        for (int i = 0; i < 15; i++) {
            System.out.println(fib(i));
        }
        System.out.println();
        System.out.println(cash);
    }

    private static BigInteger fib(long i) {
        if (i == 0) {
            return BigInteger.ZERO;
        }
        if (i == 1) {
            return BigInteger.ONE;
        }
        return cash.computeIfAbsent(i, n -> fib(n - 2).add(fib(n - 1)));
    }
}
