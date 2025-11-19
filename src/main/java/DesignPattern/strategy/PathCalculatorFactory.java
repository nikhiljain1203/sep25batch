package DesignPattern.strategy;

public class PathCalculatorFactory {
//    private PathCalculator carPathCalcutor;
//
//    public PathCalculator(PathCalculator carPathCalcutor) {
//
//    }

    public static PathCalculator createPathCalculator(String mode) {
        if(mode.equalsIgnoreCase("Car")) {
            //do something
            return new CarPathCalculator();

        } else if(mode.equalsIgnoreCase("Walk")) {
            //do something
            return new WalkPathCalculator();

        } else {
            //
            System.out.println("Unknown Mode");
            return null;
        }
    }
}
