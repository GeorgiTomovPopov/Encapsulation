package PizzaCalories;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        String pizzaName = firstLine[1];
        int toppingsAmount = Integer.parseInt(firstLine[2]);
        Pizza pizza = new Pizza(pizzaName, toppingsAmount);

        String[] secondLine = scanner.nextLine().split("\\s+");
        String flourType = secondLine[1];
        String bakingTechnique = secondLine[2];
        double doughWeight = Double.parseDouble(secondLine[3]);
        Dough dough = new Dough(flourType, bakingTechnique, doughWeight);

        pizza.setDough(dough);

        String command = scanner.nextLine();

        while (!"END".equals(command)){
            String[] tokens = command.split("\\s+");
            String toppingType = tokens[1];
            double toppingWeight = Double.parseDouble(tokens[2]);
            Topping topping = new Topping(toppingType, toppingWeight);

            pizza.addTopping(topping);

            command = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
