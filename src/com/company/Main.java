package com.company;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
	 CarDealershipSingleton carDealershipSingleton = CarDealershipSingleton.getInstance();

     Car car = Car.builder().addColor("red").addMotor("1.0L").addWheels("sport").build();
     carDealershipSingleton.orderCar(car);
     Car car2 = Car.builder().addColor("blue").addMotor("2.0L").addWheels("standart").build();
     carDealershipSingleton.orderCar(car2);
     carDealershipSingleton.printOrders();
    }
}
