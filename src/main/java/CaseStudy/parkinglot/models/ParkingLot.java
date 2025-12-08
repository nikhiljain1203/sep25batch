package CaseStudy.parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingLotStatus status;
    private List<SpotAssignmentStrategy> spotAssignmentStrategies;
    private List<FeesCalculatorStrategy> feesCalculatorStrategies;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public List<SpotAssignmentStrategy> getSpotAssignmentStrategies() {
        return spotAssignmentStrategies;
    }

    public void setSpotAssignmentStrategies(List<SpotAssignmentStrategy> spotAssignmentStrategies) {
        this.spotAssignmentStrategies = spotAssignmentStrategies;
    }

    public List<FeesCalculatorStrategy> getFeesCalculatorStrategies() {
        return feesCalculatorStrategies;
    }

    public void setFeesCalculatorStrategies(List<FeesCalculatorStrategy> feesCalculatorStrategies) {
        this.feesCalculatorStrategies = feesCalculatorStrategies;
    }
}
