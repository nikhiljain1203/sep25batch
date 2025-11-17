package DesignPattern.decorator;

/*IceCream Decorator Pattern Example*/
public class Client {
    public static void main(String[] args) {
        //IceCreamIngredients iceCreamIngredients = new Cherry();
        IceCreamIngredients iceCreamIngredients = new Cherry(
                                                    new OrangeCone(
                                                        new ChocolateSyurp(
                                                            new ChocolateCone()
                                                        )));

        System.out.println("Description: " + iceCreamIngredients.getDescription());
        System.out.println("Cost: " + iceCreamIngredients.getCost());
    }
}
