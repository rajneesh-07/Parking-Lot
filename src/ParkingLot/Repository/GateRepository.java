package ParkingLot.Repository;

import ParkingLot.Models.Gate;

public interface GateRepository {
    Gate get(int gateId);
    void put(Gate gate);
}
