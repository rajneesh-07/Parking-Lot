package ParkingLot.Strategy.BillCalcStrategy;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LinearBillCalcStrategy implements BillCalcStrategy{
    public static int BASE_RATE = 50;
    public static int HOURLY_RATE = 40;
    private double amount;


    @Override
    public double calculateAmount(ParkingLot parkingLot, Ticket ticket) {
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
