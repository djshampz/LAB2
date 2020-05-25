package com.company;

public class Sedan extends Vehicle implements Automobile{

    @Override
    public void isHighCapacity() {
        if (capacity <= 4) {
            System.out.println("Is of low capacity low number of seats");
        }
        else {
            System.out.println("Is of high capacity high number of seats");
        }
    }

    @Override
    public void isFast() {
        if (maxSpeed <= 150)
            System.out.println("Is a slowCar");
        else
            System.out.println("Is a fast car");
    }

    @Override
    public void acceleration(float addSpeed) {
        this.speed = speed + addSpeed;
        }

    @Override
    public void gas() {
        this.gasTank = gasTank;
            if (gasTank == 0)
                System.out.println("Gas is empty");
            else
                System.out.println("Gas available good to go");
    }

    @Override
    public void motion() {
        this.speed = speed;
        if (speed == 0 )
            System.out.println("You are at a stand still");
        else
            System.out.println("We are moving");
    }

    @Override
    public void identity() {
        this.licencePlate = licencePlate;
        System.out.println("licence Plate: " + licencePlate);
    }
    public void myCar (){
        System.out.println("My Sedan Diagnostics");
        identity();
        motion();
        gas();
        isHighCapacity();
        isFast();
    }
}

