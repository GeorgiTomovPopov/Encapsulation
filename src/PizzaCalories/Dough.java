package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public double calculateCalories() {
        double doughModifier = calculateDoughMod(flourType);
        double bakingTechModifier = calculateBakingTechMod(bakingTechnique);

        return 2 * weight * doughModifier * bakingTechModifier;
    }

    private double calculateBakingTechMod(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy")) {
            return 0.9;
        } else if (bakingTechnique.equals("Chewy")) {
            return 1.1;
        }

        return 1.0;
    }

    private double calculateDoughMod(String flourType) {
        if (flourType.equals("White")) {
            return 1.5;
        }

        return 1;
    }


    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
                this.flourType = flourType;
                break;
            case "Wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        } else {
            this.weight = weight;
        }
    }
}
