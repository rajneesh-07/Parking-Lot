package ParkingLot.Exception;

public class ParkingSpotNotAvailableException extends RuntimeException{

    public ParkingSpotNotAvailableException(String message){
        super(message);
    }
    public ParkingSpotNotAvailableException(String message, Exception cause){
        super(message, cause);
    }
}
