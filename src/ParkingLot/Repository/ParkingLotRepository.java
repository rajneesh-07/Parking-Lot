package ParkingLot.Repository;

import ParkingLot.Models.ParkingLot;

public interface ParkingLotRepository {
    ParkingLot get(int parkingLotId);
    void put(ParkingLot parkingLot);
}
