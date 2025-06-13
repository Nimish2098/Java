package com.dependency.constructor.injection;

public class Car {
    private Specifications specification;

    Car(Specifications specification){
        this.specification=specification;
    }

    public void displayDetails(){
        System.out.println("Car Details"+ specification.toString());
    }
}
