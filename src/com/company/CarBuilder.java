package com.company;

public class CarBuilder {

    String wheels;
    String motor;
    String color;


    public CarBuilder addWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }
    public CarBuilder addMotor(String motor) {
        this.motor = motor;
        return this;
    }
    public CarBuilder addColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() throws IllegalAccessException {
        if(wheels == null || wheels.isEmpty() || motor == null || motor.isEmpty() || color == null || color.isEmpty()){
            throw new IllegalAccessException("nejsou parametry");
        }
        return new Car(wheels,motor,color);
    }
}
