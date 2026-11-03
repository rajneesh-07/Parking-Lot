package ParkingLot.Repository;

import ParkingLot.Models.ParkingSpot;

public interface ParkingSpotRepository {
    ParkingSpot get(int parkingSpotId);
    void put(ParkingSpot parkingSpot);
}
