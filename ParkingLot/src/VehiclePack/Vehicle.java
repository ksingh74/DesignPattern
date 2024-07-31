package VehiclePack;

public class Vehicle {
    Integer number;
    VehicleType type;
    public VehicleType getType() {
        return type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
}
