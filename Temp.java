import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Tom", "Fred", "Mary") );
        // treeSet.forEach(elemnt -> System.out.print(elemnt + " "));
        System.out.println("привет");

        while (scanner.hasNext()) {
            String[] line  = scanner.nextLine().split(" ");
            String name = line[0] + " " + line[1];
            // String purchase =  line[2];
            // int price = Integer.parseInt( line[3]);
            String purchaseAndPrice = line[2] + " " + line[3];
            System.out.println(name + " " + purchaseAndPrice);
            
        }
        

    }
}
