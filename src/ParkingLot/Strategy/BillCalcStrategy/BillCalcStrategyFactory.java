package ParkingLot.Strategy.BillCalcStrategy;

import static ParkingLot.Strategy.BillCalcStrategy.PricingStrategy.LINEAR;

public class BillCalcStrategyFactory {

    public BillCalcStrategy getBillCalcStrategy(PricingStrategy pricingStrategy){
        return switch (pricingStrategy){
            case LINEAR -> new LinearBillCalcStrategy();
            case SURGE -> new SurgeBillCalcStrategy();
        };
    }
}
