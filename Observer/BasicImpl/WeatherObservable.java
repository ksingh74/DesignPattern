import java.util.List;

public interface WeatherObservable {
//    List<WeatherObserver> observers = null; // Removing this as for interface objects are final
    void addObservers(WeatherObserver weatherObserver);
    void removeObservers(WeatherObserver weatherObserver);
    void notifyObservers();
    void setTemperature(Integer temperature);
    Integer getCurrentTemperature();
}
