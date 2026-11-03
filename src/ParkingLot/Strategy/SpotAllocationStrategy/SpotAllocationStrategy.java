package ParkingLot.Strategy.SpotAllocationStrategy;

import ParkingLot.Models.Constants.ParkingSpotType;
import ParkingLot.Models.ParkingSpot;
import ParkingLot.Models.Vehicle;
import ParkingLot.Models.ParkingLot;

public interface SpotAllocationStrategy {
    ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType);
}
