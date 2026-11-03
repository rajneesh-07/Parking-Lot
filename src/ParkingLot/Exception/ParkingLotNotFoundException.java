package ParkingLot.Exception;

public class ParkingLotNotFoundException extends RuntimeException{

    public ParkingLotNotFoundException(String message){
        super(message);
    }
    public ParkingLotNotFoundException(String message, Exception cause){
        super(message, cause);
    }
}
