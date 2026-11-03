package ParkingLot.Strategy.SpotAllocationStrategy;

import ParkingLot.Exception.ParkingSpotNotAvailableException;
import ParkingLot.Models.Constants.ParkingSpotStatus;
import ParkingLot.Models.Constants.ParkingSpotType;
import ParkingLot.Models.ParkingFloor;
import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSpot;
import ParkingLot.Models.Vehicle;

public class LinearParkingSpotAllocationStrategy implements SpotAllocationStrategy{

    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot,Vehicle vehicle, ParkingSpotType parkingSpotType) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : parkingFloor.getParkingSpots()){
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) && spot.getParkingSpotType().equals(vehicle.getVehicleType())){
                    return spot;
                }
            }
        }
        throw new ParkingSpotNotAvailableException("Parking spot is not available!");
    }
}
