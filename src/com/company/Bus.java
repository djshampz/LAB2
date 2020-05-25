package com.company;

public class Bus extends Vehicle{
    @Override
    public void acceleration(float addSpeed) {
        this.speed = speed + addSpeed;
    }

    @Override
    public void gas() {
        this.gasTank = gasTank;
        if (gasTank == 0 )
            System.out.println("Gas Tank is empty");
        else
            System.out.println("You are good to go");
    }

    @Override
    public void motion() {
        this.speed = speed;
    }

    @Override
    public void identity() {
        this.licencePlate = licencePlate;
        System.out.println("licence Plate: " + licencePlate);
    }

    @Override
    public void myCar() {
        System.out.println("My Sedan Diagnostics");
        identity();
        motion();
        gas();
    }
}
