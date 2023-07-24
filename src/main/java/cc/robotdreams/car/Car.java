package cc.robotdreams.car;

import java.util.ArrayList;
import java.util.List;

public class Car
{

    final public String brand;
    final public String model;
    final public Transmission transmission = new Transmission(this);

    final protected List<Door> doors = new ArrayList<>();

    final public Door doorFrontRight    = new Door(this);
    final public Door doorFrontLeft     = new Door(this);
    final public Door doorRearRight     = new Door(this);
    final public Door doorRearLeft      = new Door(this);

    protected boolean closeAllDoorsOnDrive = false;

    public Car(String brand, String model) {                     // constructor
        this.brand = brand;
        this.model = model;
    }

    public void setOptionCloseAllDoorsOnDrive(boolean value) {  // method
        closeAllDoorsOnDrive = value;
        System.out.println("closeAllDoorsOnDrive: " + closeAllDoorsOnDrive);
    }


}
