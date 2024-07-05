import java.util.List;
import java.util.Objects;

public class WeatherObservableImpl1 implements WeatherObservable{
    private List<WeatherObserver> observerList;
    private Integer currentTemperature;
    @Override
    public void addObservers(WeatherObserver weatherObserver) {
        System.out.println("Adding new observer : {}");
        observerList.add(weatherObserver);
    }

    @Override
    public void removeObservers(WeatherObserver weatherObserver) {
        System.out.println("This implementation of list is being used : " + observerList.getClass());
        System.out.println("Removing this observer : {}");
        observerList.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer : observerList) {
            System.out.println(String.format("Observer : {} , the temperature has changed to : {}", observer, currentTemperature));
        }
    }

    @Override
    public void setTemperature(Integer temperature) {
        System.out.println("This observable is setting the temperature : " + this.getClass().getSimpleName());
        System.out.println(String.format("Temperature being set is : {}", temperature));
        if(!Objects.equals(temperature, currentTemperature))
            notifyObservers();
    }

    @Override
    public Integer getCurrentTemperature() {
        return currentTemperature;
    }
}
