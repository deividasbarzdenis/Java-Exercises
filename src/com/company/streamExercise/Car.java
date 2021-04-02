package com.company.streamExercise;

public class Car {
    public final String make;
    public final String color;
    public final Float price;

    public Car(String make, String color, Float price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
