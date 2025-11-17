package DesignPattern.decorator;

public class Cherry implements IceCreamIngredients{
    IceCreamIngredients iceCreamIngredients;
    private int cost = 10;
    private String description = "Cherry";

    public Cherry(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }


    @Override
    public String getDescription() {
        return iceCreamIngredients.getDescription() + " " + description;
    }

    @Override
    public int getCost() {
        return iceCreamIngredients.getCost() + cost;
    }
}
