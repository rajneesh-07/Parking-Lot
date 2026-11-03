package ParkingLot.Repository;

import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepositoryImpl implements ParkingLotRepository{
    private Map<Integer, ParkingLot> parkingLotMap;
    public static int idCounter = 1;

    public ParkingLotRepositoryImpl(){
        this.parkingLotMap = new HashMap<>();
    }
    @Override
    public ParkingLot get(int parkingLotId) {
        ParkingLot lot = parkingLotMap.get(parkingLotId);
        if(lot == null){
            throw new ParkingLotNotFoundException("Parking Lot does not Exists!");
        }
        return lot;
    }

    @Override
    public void put(ParkingLot parkingLot) {
        parkingLot.setId(idCounter++);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking Lot added successfully");
    }
}
