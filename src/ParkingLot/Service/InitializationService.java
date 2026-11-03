package ParkingLot.Service;

import ParkingLot.Models.Constants.*;
import ParkingLot.Models.ParkingFloor;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSpot;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingFloorRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitializationService(GateRepository gateRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("*******Initializing Parking Lot*******");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Unique Parking Lot");
        parkingLot.setAddress("Near DB city Mall");
        parkingLot.setCapacity(100);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setVehicleTypeSupported(List.of((VehicleType.TWO_WHEEL), VehicleType.FOUR_WHEEL));

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for(int i = 1; i<=10; i++){
            ParkingFloor floor = new ParkingFloor();
            floor.setFloorNo(i);

            List<ParkingSpot> spots = new ArrayList<>();

            for(int j = 1; j <= 10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100) + j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setParkingSpotType(ParkingSpotType.NORMAL);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEEL);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);

            }
            floor.setParkingSpots(spots);

            Gate entryGate = new Gate();
            entryGate.setId((i*1000)+1);
            entryGate.setGateNo(i*100 + 1);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i + 1);
            floor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNo(i*100 + 2);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " + i + 2);
            floor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            parkingFloors.add(floor);
            parkingFloorRepository.put(floor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
