package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Nissan altima = new Nissan("4 cylinder", 4, "Altima",4,false, "SR");
        Nissan murano = new Nissan("6th cylinder", 4, "Murano", 6,false,  "SV");
        System.out.println(altima.getName());
        System.out.println(altima.getMotor());
        System.out.println(altima.getType());
        altima.steer(45);
        altima.accelarate(30);
        altima.accelarate(20);
        altima.accelarate(-42);
    }
}
