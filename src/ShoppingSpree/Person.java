package ShoppingSpree;


import java.util.ArrayList;
import java.util.List;

//Create two classes: class Person and class Product. Each person should have a name, money, and a bag of products.
public class Person {
    private String name;
    private double money;
    private List<Product> products;


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" - ");
        if (products.isEmpty()) {
            stringBuilder.append("Nothing bought");
        } else {
            for (Product product :
                    products) {
                stringBuilder.append(product.getName());
                stringBuilder.append(", ");
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }



        return stringBuilder.toString();
    }

    public void buyProduct(Product product) {
        if (money >= product.getCost()) {

            products.add(product);
            money = money - product.getCost();
        } else {
            System.out.printf("%s can't afford %s\n", name, product.getName());
        }
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }



    private void setName(String name) {
        if (name.isEmpty() || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }
}
