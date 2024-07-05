public class MobileObserver implements WeatherObserver {
    private WeatherObservable weatherObservable;

    public MobileObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void update() {
        System.out.println(String.format("Weather observable : {} has reported a changed temperature of : {}",
                weatherObservable.getClass().getSimpleName(), weatherObservable.getCurrentTemperature()));
    }
}