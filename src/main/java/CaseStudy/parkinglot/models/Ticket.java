package CaseStudy.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String number;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Date entryTime;
    private Gate entryGate;
    private Operator issuedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Operator getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Operator issuedBy) {
        this.issuedBy = issuedBy;
    }
}
