package com.company;

public class SportsCar extends Vehicle implements Automobile {
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
        if (maxSpeed <= 50)
            System.out.println("Is a slowCar");
        else
            System.out.println("Is a fast car");
    }

    @Override
    public void acceleration(float addSpeed) {

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
    }

    @Override
    public void identity() {
        this.licencePlate = licencePlate;
        System.out.println("licence Plate: " + licencePlate);
    }
    public void myCar (){
        System.out.println("My Sports car Diagnostics");
        identity();
        motion();
        gas();
        isHighCapacity();
        isFast();
    }
}
