package ParkingSpotPack;

import VehiclePack.VehicleType;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        switch (vehicleType) {
            case FOUR_WHEELER :
                return new FourWheelerSpotManager(parkingSpots);
            case TWO_WHEELER:
                return new TwoWheelerSpotManager(parkingSpots);
            default:
                return null;
        }
    }
}
