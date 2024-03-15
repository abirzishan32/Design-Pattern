
import java.util.ArrayList;
import java.util.List;


//Now, we implement the WeatherStation class,
//which acts as the concrete subject. It will maintain the list of observers and notify them when the weather changes.

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int humidity;

    public void setWeatherData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
