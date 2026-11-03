import ParkingLot.Models.ParkingLot;
import ParkingLot.Repository.*;
import ParkingLot.Service.InitializationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepositoryImpl();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepositoryImpl();
        GateRepository gateRepository = new GateRepositoryImpl();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepositoryImpl();

        InitializationService initializationService = new InitializationService(
                gateRepository, parkingFloorRepository,parkingLotRepository, parkingSpotRepository);

        initializationService.init();
    }
}