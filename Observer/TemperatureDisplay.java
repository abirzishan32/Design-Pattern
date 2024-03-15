//Next, we create concrete observers (displays) that implement the 
  //Observer interface. We'll create two displays: TemperatureDisplay and HumidityDisplay.
public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("Temperature Display: Current Temperature is " + temperature + " degrees Celsius.");
    }
}
