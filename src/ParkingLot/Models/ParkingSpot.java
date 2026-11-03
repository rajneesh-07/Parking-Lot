package ParkingLot.Models;

import ParkingLot.Models.Constants.ParkingSpotStatus;
import ParkingLot.Models.Constants.ParkingSpotType;
import ParkingLot.Models.Constants.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;

    public ParkingSpot(){}

    public ParkingSpot(int number, Vehicle vehicle, ParkingSpotType parkingSpotType, ParkingSpotStatus parkingSpotStatus, VehicleType vehicleType) {
        this.number = number;
        this.vehicle = vehicle;
        this.parkingSpotType = parkingSpotType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicleType = vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
