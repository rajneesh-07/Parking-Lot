package ParkingLot.Repository;

import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepositoryImpl implements ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;
    public static int idCounter = 1;

    public ParkingSpotRepositoryImpl() {
        this.parkingSpotMap = new HashMap<>();
    }


    @Override
    public ParkingSpot get(int parkingSpotId) {
        ParkingSpot spot = parkingSpotMap.get(parkingSpotId);
        if(spot == null){
            throw new ParkingLotNotFoundException("Parking Spot Does not Exists!");
        }
        return spot;
    }

    @Override
    public void put(ParkingSpot parkingSpot) {
        parkingSpot.setId(idCounter++);
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking spot added successfully");
    }
}
