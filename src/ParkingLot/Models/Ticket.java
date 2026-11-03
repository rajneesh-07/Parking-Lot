package ParkingLot.Models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Gate entryGate;
    private ParkingSpot parkingSpot;

    public Ticket() {
    }

    public Ticket(Vehicle vehicle, LocalDateTime entryTime, Gate entryGate, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.parkingSpot = parkingSpot;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
