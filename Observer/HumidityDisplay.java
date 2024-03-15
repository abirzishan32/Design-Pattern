public class HumidityDisplay implements Observer {
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("Humidity Display: Current Humidity is " + humidity + "%.");
    }
}
