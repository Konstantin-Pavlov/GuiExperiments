import java.util.Arrays;
import java.util.TreeSet;

public class Temp {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Tom", "Fred", "Mary") );
        treeSet.forEach(elemnt -> System.out.print(elemnt + " "));
        

    }
}
