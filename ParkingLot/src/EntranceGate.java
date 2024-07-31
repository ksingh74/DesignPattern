import ParkingSpotPack.ParkingSpot;
import ParkingSpotPack.ParkingSpotManager;
import ParkingSpotPack.ParkingSpotManagerFactory;
import VehiclePack.Vehicle;
import VehiclePack.VehicleType;

import java.util.List;

public class EntranceGate {
    private ParkingSpotManagerFactory parkingSpotManagerFactory;
    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    public void parkVehicle(Vehicle vehicle, List<ParkingSpot> parkingSpots) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getType(), parkingSpots);
        parkingSpotManager.parkVehicle(vehicle);
    }
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);
    }
}
