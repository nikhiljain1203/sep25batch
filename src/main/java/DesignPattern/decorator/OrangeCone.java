package DesignPattern.decorator;

public class OrangeCone implements IceCreamIngredients {
    IceCreamIngredients iceCreamIngredients;
    private int cost = 25;
    private String description = " Orange Cone";

    public OrangeCone(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    public OrangeCone() {}

    @Override
    public String getDescription() {
        if (iceCreamIngredients == null) {
            return description;
        }
        return iceCreamIngredients.getDescription() + description;
    }

    @Override
    public int getCost() {
        if (iceCreamIngredients != null) {
            return iceCreamIngredients.getCost() + cost;
        }
        return cost;
    }
}
