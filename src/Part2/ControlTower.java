package Part2;
import java.util.*;
public class ControlTower implements TowerMediator {
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();

    @Override
    public void broadcast(String msg, Aircraft sender) {
        System.out.println("Message from the controlTower: " + msg);
        if (msg.equals("MAYDAY")) {
            clearRunway();
        }
    }

    @Override
    public boolean requestRunway(Aircraft a) {
        if (a instanceof PassengerPlane) {
            landingQueue.add(a);
            System.out.println("PassengerPlane " + a.id + " added to landing queue.");
        }
        return true;
    }

    private void clearRunway() {
        System.out.println("Runway cleared for emergency!");
        landingQueue.clear();
        takeoffQueue.clear();
    }

    public void handleAircrafts() {
        while (!landingQueue.isEmpty()) {
            Aircraft aircraft = landingQueue.poll();
            System.out.println("Aircraft " + aircraft.id + " landing now.");
        }
    }
}
