import java.util.Scanner;

public class tst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double tarif = 0.77;
        System.out.print("введите пред-е показание: "); //34578
        int prev = scanner.nextInt();
        System.out.print("введите тек-е показание: "); // 34998
        int cur = scanner.nextInt();

        int result = Math.abs(cur - prev);
        System.out.println("Вы потребили: " + result);
        System.out.println("тариф: " + tarif);
        System.out.println("к оплате: " + round((result * tarif), 1 ));


        scanner.close();
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
