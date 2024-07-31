package ParkingSpotPack;

import VehiclePack.Vehicle;
import VehiclePack.VehicleType;

import java.util.List;
import java.util.Objects;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    public ParkingSpotManager(List<ParkingSpot> spots) {
        this.parkingSpots = spots;
    }
    public ParkingSpot findParkingSpot() {
        for(ParkingSpot spot : parkingSpots) {
            if(spot.getEmpty())
                return spot;
        }
        return null;
    }
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }
    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot availableSpot = findParkingSpot();
        if(Objects.nonNull(availableSpot))
            availableSpot.parkVehicle(vehicle);
        else
            System.out.println("No spot available to park vehicle");
    }
    public void removeVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle(vehicle);
    }
}
