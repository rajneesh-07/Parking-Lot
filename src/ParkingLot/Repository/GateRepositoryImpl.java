package ParkingLot.Repository;

import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepositoryImpl implements GateRepository{
    private Map<Integer, Gate> gateMap;
    public static int idCounter = 1;

    public GateRepositoryImpl(){
        this.gateMap = new HashMap<>();
    }

    @Override
    public Gate get(int gateId) {
      Gate gate = gateMap.get(gateId);
      if(gate == null){
          throw new ParkingLotNotFoundException("Gate does not Exists!");
      }
        return gate;
    }

    @Override
    public void put(Gate gate) {
    gate.setId(idCounter++);
    gateMap.put(gate.getId(), gate);
    System.out.println("Gate added successfully");
    }
}
