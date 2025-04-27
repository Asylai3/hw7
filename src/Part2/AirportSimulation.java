package Part2;
import java.util.*;
public class AirportSimulation {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        Aircraft plane1 = new PassengerPlane("Pass1");
        Aircraft plane2 = new CargoPlane("Cargo1");
        Aircraft helicopter = new Helicopter("Hel1");

        plane1.send("Requesting to land", tower);
        plane2.send("Requesting to land", tower);
        helicopter.send("Requesting to land", tower);

        plane1.send("MAYDAY", tower);

        tower.handleAircrafts();
    }
}


