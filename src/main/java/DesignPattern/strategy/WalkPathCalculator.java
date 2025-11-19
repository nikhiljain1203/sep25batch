package DesignPattern.strategy;

public class WalkPathCalculator implements PathCalculator {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk Path Has Been Calculated");
    }
}
