package cc.robotdreams.car;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

final public class Transmission
{
    //final private Map<String, Function> hooks = new HashMap<>();
    private final Car car;

    Transmission(Car car) {
        this.car = car;                                 // constructor

    }

    public void setDrive() {
        if (car.closeAllDoorsOnDrive) {
            // do something
            car.doors.forEach((door -> door.setLocked(true)));
            System.out.println("Car.this.closeAllDoorsOnDrive: " + car.closeAllDoorsOnDrive);
        }
        /* .....*/

    }

}
