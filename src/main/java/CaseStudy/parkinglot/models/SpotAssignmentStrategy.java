package CaseStudy.parkinglot.models;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle);
}
