//The Subject interface is an abstraction that defines the operations
// to manage a list of observers (listeners) and to notify them of changes.
//It's used to create concrete subjects (observable objects) that
// observers can register with and be notified of changes.
import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

