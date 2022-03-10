package com.company;

public class BodyMass {
    private double height;
    private double weight;

    public BodyMass(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getBmi(){
        return(weight/(height*height));
    }
}



