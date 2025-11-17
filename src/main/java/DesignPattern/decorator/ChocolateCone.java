package DesignPattern.decorator;

public class ChocolateCone implements IceCreamIngredients {

    private int cost = 30;
    private String description = "Chocolate Cone";

    IceCreamIngredients iceCreamIngredients;

    public ChocolateCone(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    public ChocolateCone() {}

    @Override
    public String getDescription() {
        if(iceCreamIngredients == null) {
            return description;
        }
        return iceCreamIngredients.getDescription() + description;
    }

    @Override
    public int getCost() {
        if(iceCreamIngredients != null) {
            return iceCreamIngredients.getCost() + cost;
        }
        return cost;
    }
}
