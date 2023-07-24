package cc.robotdreams;

import cc.robotdreams.car.Car;

import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args) throws Throwable
    {
        Car car = new Car("BMW","M3");

        // via reflexion
        for (Field field: car.getClass().getDeclaredFields()) {
            //System.out.println(field.getAnnotatedType().getType() + " " + field.getName());
        }
        car.setOptionCloseAllDoorsOnDrive(true);  // incapsulation - all operation inside setOptionCloseAllDoorsOnDrive
        car.transmission.setDrive();

        car.doorFrontRight.open();

    }
}