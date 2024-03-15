//Next, we define the Observer interface.
// This interface will be implemented by all observers (displays).
public interface Observer {
    void update(int temperature, int humidity);
}
