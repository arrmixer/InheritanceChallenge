package com.AE;

/**
 * Created by Angel on 11/6/16.
 */
public class Nissan extends Car {
    private String type;

    public Nissan(String motor, int doors, String name, int gears, boolean isManual, String type) {
        super(motor, doors, name, gears, isManual);
        this.type = type;
    }

    public void accelarate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <=40){
            changeGear(4);
        }else if(newVelocity > 40 && newVelocity <=50){
            changeGear(5);
        }else{
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public String getType() {
        return type;
    }
}
