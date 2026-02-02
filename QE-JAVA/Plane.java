
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

    // Private fields (Encapsulation)
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor: initializes maxPassengers and empty passengers list
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // onboard(): add passenger to the list
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full! Cannot onboard more passengers.");
        }
    }

    // takeOff(): sets lastTimeTookOff and returns it
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    // land(): sets lastTimeLanded, clears passengers, returns time
    public Date land() {
        lastTimeLanded = new Date();
        passengers.clear();
        return lastTimeLanded;
    }

    // Getter methods
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
