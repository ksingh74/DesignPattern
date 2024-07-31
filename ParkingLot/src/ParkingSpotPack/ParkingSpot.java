package ParkingSpotPack;

import VehiclePack.Vehicle;

public class ParkingSpot {
    private Integer id;
    private Boolean isEmpty;
    private Vehicle parkedVehicle;
    private Integer price = 50;

    public ParkingSpot(Integer id, Boolean isEmpty, Vehicle parkedVehicle, Integer price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.parkedVehicle = parkedVehicle;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.isEmpty = false;
        this.parkedVehicle = vehicle;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.isEmpty = true;
        this.parkedVehicle = null;
    }

}
