package CaseStudy.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus status;
    private int spotNumber;
    private ParkingFloor parkingFloor;
}
