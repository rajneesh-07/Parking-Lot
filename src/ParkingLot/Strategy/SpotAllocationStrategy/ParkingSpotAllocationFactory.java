package ParkingLot.Strategy.SpotAllocationStrategy;

public class ParkingSpotAllocationFactory {
    public SpotAllocationStrategy getSpotAllocationStrategy(AllocationStrategy allocationStrategy){
        return switch(allocationStrategy){
            case LINEAR -> new LinearParkingSpotAllocationStrategy();
            case NEAR_EXIT -> new NearExitParkingSpotAllocationStrategy();
        };
    }
}
