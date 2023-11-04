package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public double getOverallCalories() {
        double overallCalories = 0;
        overallCalories += dough.calculateCalories();

        for (Topping topping :
                toppings) {
            overallCalories += topping.calculateCalories();
        }

        return overallCalories;
    }

    public Pizza(String name, int amountOfToppings) {
        setName(name);
        setToppings(amountOfToppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name.length() > 15 || name.trim().isEmpty() || name.isEmpty()) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    private void setToppings(int amountOfToppings) {
        if (amountOfToppings < 0 || amountOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        } else {
            this.toppings = new ArrayList<>(amountOfToppings);
        }
    }
}
