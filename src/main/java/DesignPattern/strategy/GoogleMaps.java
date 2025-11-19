package DesignPattern.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, String mode) {
        PathCalculator pc = PathCalculatorFactory.createPathCalculator(mode);
        pc.findPath(source, destination);
    }
}
