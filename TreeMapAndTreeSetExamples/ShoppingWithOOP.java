package TreeMapAndTreeSetExamples;

import java.util.*;
import java.util.stream.Collectors;

public class ShoppingWithOOP {
    static final Comparator<Person> compareByFullName = Comparator.comparing(Person::toString);
    static final Comparator<Product> compareByProductName = Comparator.comparing(Product::getName);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<Person, Set<Product>> map = new TreeMap<>(compareByFullName);
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split(" ");
                Product product = new Product(tokens[2], Integer.parseInt(tokens[3]));
                Person person = new Person(tokens[0], tokens[1], product);

                map.computeIfAbsent(person, person1 -> new TreeSet<>(compareByProductName))
                        .add(product);
            }

            for (Map.Entry<Person, Set<Product>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": ");
                String collect = entry.getValue().stream()
                        .map(product -> "    " + product)
                        .collect(Collectors.joining("\n"));
                System.out.println(collect);
            }
        }
    }
}

class Person {

    private String firstName;
    private String lastName;
    private Product product;

    public Person(String firstName, String lastName, Product product) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.product = product;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}

class Product {

    private String name;
    private Integer cost;

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return getName() + " " + getCost();
    }
}
