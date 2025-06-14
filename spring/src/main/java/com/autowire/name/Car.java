package com.autowire.name;

public class Car {
    private Specifications specification;

     public void setSpecification(Specifications specification) {
        this.specification = specification;
    }
    public void getCarDetails(){
        System.out.println("Car Details: " + specification.toString());
    }


   
}
