package ShoppingSpree;

//Each product should have a name and cost. The name cannot be an empty string.
// Be careful about white space in the name. Money and cost cannot be a negative number.
public class Product {

    private String name;
    private double cost;


    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
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

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
