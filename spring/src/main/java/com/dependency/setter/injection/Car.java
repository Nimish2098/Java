package com.dependency.setter.injection;

public class Car {

    private  Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    
    public void getCarDetails(){
        System.out.println("Car Details: "+specification.toString());
    }
}
