package DesignPattern.strategy;

public class CarPathCalculator implements PathCalculator {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car Path Has been calculated");
    }
}
