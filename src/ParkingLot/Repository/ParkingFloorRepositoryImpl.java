package ParkingLot.Repository;

import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepositoryImpl implements ParkingFloorRepository{
    private Map<Integer, ParkingFloor> floorMap;
    public static int idCounter = 1;

    public ParkingFloorRepositoryImpl(){
        this.floorMap = new HashMap<>();
    }
    @Override
    public ParkingFloor get(int floorId) {
        ParkingFloor parkingFloor = floorMap.get(floorId);
        if(parkingFloor == null){
            throw new ParkingLotNotFoundException("Floor does not Exists!");
        }
        return parkingFloor;
    }

    @Override
    public void put(ParkingFloor parkingFloor) {
        parkingFloor.setId(idCounter++);
        floorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Floor added successfully");
    }
}
