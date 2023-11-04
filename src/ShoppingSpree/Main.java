package ShoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] peopleInput = scanner.nextLine().split(";");

        List<Person> people = new LinkedList<>();

        for (int i = 0; i < peopleInput.length; i++) {
            String current = peopleInput[i];
            String[] tokens = current.split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            people.add(new Person(name, money));
        }

        String[] productInput = scanner.nextLine().split(";");

        List<Product> products = new LinkedList<>();

        for (int i = 0; i < productInput.length; i++) {
            String current = productInput[i];
            String[] tokens = current.split("=");
            String name = tokens[0];
            double cost = Double.parseDouble(tokens[1]);
            products.add(new Product(name, cost));
        }

        String command = scanner.nextLine();



        while (!"END".equals(command)) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            Person currentPerson = getPerson(personName, people);
            Product currentProduct = getProduct(productName, products);

            currentPerson.buyProduct(currentProduct);


            command = scanner.nextLine();
        }

        for (Person person :
                people) {
            System.out.println(person);
        }
    }

    private static Product getProduct(String productName, List<Product> products) {
        for (Product product :
                products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    private static Person getPerson(String personName, List<Person> people) {
        for (Person person :
                people) {
            if (person.getName().equals(personName)) {
                return person;
            }
        }
        return null;
    }
}
