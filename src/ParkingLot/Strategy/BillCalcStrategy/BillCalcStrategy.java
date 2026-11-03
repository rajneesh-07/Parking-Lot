package ParkingLot.Strategy.BillCalcStrategy;

import ParkingLot.Models.Ticket;
import ParkingLot.Models.ParkingLot;

public interface BillCalcStrategy {
    double calculateAmount(ParkingLot parkingLot, Ticket ticket);
}
