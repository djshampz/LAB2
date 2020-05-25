package com.company;

/*
    Group Members
    100994 Kimani Martin Gitau
    Alvin Moses
 */
public class Main{
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.licencePlate = "8904 UIRJ";
        mySedan.maxSpeed = 150;
        mySedan.gasTank = 78;
        mySedan.capacity = 4;
        mySedan.speed = 0;
        mySedan.myCar();

        System.out.println(" ");

        SportsCar mySportsCar = new SportsCar();
        mySportsCar.licencePlate = "8632 IHND";
        mySportsCar.maxSpeed = 300;
        mySportsCar.gasTank = 0;
        mySportsCar.capacity = 2;
        mySportsCar.speed = 0;
        mySportsCar.myCar();
    }
}
