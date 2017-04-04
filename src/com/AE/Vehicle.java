package com.AE;

/**
 * Created by Angel on 11/6/16.
 */
public class Vehicle {
    private int body;
    private int wheels;
    private String motor;
    private int doors;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int body, int wheels, String motor, int doors) {
        this.body = body;
        this.wheels = wheels;
        this.motor = motor;
        this.doors = doors;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() is called moving " + direction + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() is called moving at " + velocity + " and in this direction " + direction + ".");

    }

    public void stop(){
        this.currentVelocity = 0;
    }
    public int getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }

    public String getMotor() {
        return motor;
    }

    public int getDoors() {
        return doors;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
