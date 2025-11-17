package DesignPattern.decorator;

public class ChocolateSyurp implements IceCreamIngredients {
    IceCreamIngredients iceCreamIngredients;
    private int cost = 15;
    private String description = " Chocolate Syrup";

    public ChocolateSyurp(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    @Override
    public String getDescription() {
        return iceCreamIngredients.getDescription() + description;
    }

    @Override
    public int getCost() {
        return iceCreamIngredients.getCost() + cost;
    }
}
