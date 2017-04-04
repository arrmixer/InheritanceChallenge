package com.AE;

/**
 * Created by Angel on 11/6/16.
 */
public class Car extends Vehicle{
    private String name;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String motor, int doors, String name, int gears, boolean isManual) {
        super(1, 4, motor, doors);
        this.name = name;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(). Gear changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(). The velocity is " + speed + " and direction is " + direction + ".");
        move(speed, direction);

    }

    public String getName() {
        return name;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }
}
