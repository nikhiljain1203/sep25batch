package DesignPattern.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("a", "b", "Walk");
    }
}

/* Rain Water Harvesting Problem HW
*O(N2)
* ON + On
* On
* class RainWaterTrappingProblem {
    solve(list<height>, string timeComplexity, spaceComplexity) {
        ...
    }
}
* */