import ParkingSpotPack.ParkingSpot;
import VehiclePack.Vehicle;

public class Ticket {
    private Long entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    public Ticket(Long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
