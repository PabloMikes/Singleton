package com.company;

public class Car{
    String wheels;
    String motor;
    String color;

    public Car(String wheels, String motor, String color) {
        this.wheels = wheels;
        this.motor = motor;
        this.color = color;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
