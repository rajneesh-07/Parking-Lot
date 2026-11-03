package ParkingLot.Strategy.BillCalcStrategy;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SurgeBillCalcStrategy implements BillCalcStrategy{
    private static int BASE_RATE = 50;
    private static int HOURLY_RATE = 40;
    private static double L1_SURGE = 1.2;
    private static double L2_SURGE = 1.65;
    private static double L3_SURGE = 2;
    @Override
    public double calculateAmount(ParkingLot parkingLot, Ticket ticket) {
        double amount = amountCalc(ticket);

        double occupancyRate = parkingLot.getOccupiedSlots()/ parkingLot.getCapacity();

        if(occupancyRate >= 0.5 && occupancyRate < 0.75){
            amount = amount * L1_SURGE;
        }
        else if(occupancyRate >= 0.75 && occupancyRate < 0.9){
            amount = amount * L2_SURGE;
        }
        else if(occupancyRate >= 0.9){
            amount = amount * L3_SURGE;
        }
        return amount;
    }

    public double amountCalc( Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        boolean basicRateCalc = false;
        double amount = 0;

        long numberOfSeconds = ChronoUnit.SECONDS.between(entryTime, exitTime);

        while(numberOfSeconds > 0){
            if(!basicRateCalc){
                amount = amount + BASE_RATE;
            }else{
                amount = amount + HOURLY_RATE;
            }

            numberOfSeconds = numberOfSeconds - 3600;
        }
        return amount;
    }
}
