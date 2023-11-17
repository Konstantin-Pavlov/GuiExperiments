package MixedStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] s = new String[]{"aA", "aa", "aaa", "aAa", "aaA"};
        TreeSet treeSet = new TreeSet (Arrays.asList(new String[]{"Aaa", "Aaa", "Aaa", "aa", "aaa"}));

        System.out.println(treeSet);
    }
}