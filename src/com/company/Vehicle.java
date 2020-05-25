package com.company;

abstract class Vehicle {
    String licencePlate;
    float gasTank;
    float maxSpeed;
    float speed;
    int capacity;

    public abstract void acceleration(float addSpeed);
    public abstract void gas();
    public abstract void motion();
    public abstract void identity();
    public abstract void myCar();
}