package com.company;

public class Motorcycle extends Vehicle{
        public void acceleration(float addSpeed){
             this.speed = speed + addSpeed;
        }
        public void gas(){
                this.gasTank = gasTank;
              if (gasTank == 0 )
                      System.out.println("Gas Tank is empty");
              else
                      System.out.println("You are good to go");
        }
        public void motion() {
                if (speed == 0)
                        System.out.println("You are at a stand still");
                else
                        System.out.println("We are moving");
        }
        public void identity(){
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
