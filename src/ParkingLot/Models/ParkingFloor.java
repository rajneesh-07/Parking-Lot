package ParkingLot.Models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNo;
    private List<ParkingSpot> parkingSpots;
    private Gate entryGate;
    private Gate exitGate;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpots, Gate entryGate, Gate exitGate) {
        this.floorNo = floorNo;
        this.parkingSpots = parkingSpots;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
