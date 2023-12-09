package GuiTests.array_implementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        for (int i = 0; i < 5; i++) {
            array.add(i);
        }
        System.out.println(array);

        // int[] a = new int[]{1, 2, 3};
        // int[] b = new int[a.length];
        // System.arraycopy(a, 0, a, 0, a.length + 1);
        // System.out.println(Arrays.toString(a));


    }

}