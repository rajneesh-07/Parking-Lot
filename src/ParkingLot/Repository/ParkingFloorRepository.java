package ParkingLot.Repository;

import ParkingLot.Models.ParkingFloor;

public interface ParkingFloorRepository {
    ParkingFloor get(int floorId);
    void put(ParkingFloor parkingFloor);
}
