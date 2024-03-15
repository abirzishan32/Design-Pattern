public class Main {
    public static void main(String[] args) {
        // Create subject (observable)
        WeatherStation weatherStation = new WeatherStation();

        // Create Observers
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();

        // Register Observers
        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(humidityDisplay);

        // Set Weather Data
        weatherStation.setWeatherData(25, 60);
    }
}
