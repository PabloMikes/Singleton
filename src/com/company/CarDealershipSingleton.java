package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarDealershipSingleton {

    static CarDealershipSingleton singleton;

    static List<Car> carList = new ArrayList<Car>();

    public static CarDealershipSingleton getInstance(){
        if(singleton == null) {
            synchronized (CarDealershipSingleton.class) {
                singleton = new CarDealershipSingleton();
                System.out.println("Singleton created.");
                singleton.setCarsList(new ArrayList<Car>());
            }
        }
        return singleton;
    }
    public CarDealershipSingleton() {

    }

    public CarDealershipSingleton(List<Car> carsList) {
        this.carList = carsList;
    }

    public static CarDealershipSingleton getInstance(List<Car> cars){
        if(singleton == null) {
            singleton = new CarDealershipSingleton(cars);
            System.out.println("Singleton created.");
            singleton.setCarsList(new ArrayList<Car>());
        }
        singleton.setCarsList(cars);
        return singleton;
    }

    public void orderCar(Car car) throws ClassNotFoundException, IllegalAccessException {
        carList.add(car);
        System.out.println("Making car with these: " + car.wheels + " " + car.motor + " " + car.color);
    }

    public void printOrders(){
        System.out.println("Orders:");
        System.out.println(carList);
    }



    public static CarDealershipSingleton getSingleton() {
        return singleton;
    }

    public static void setSingleton(CarDealershipSingleton singleton) {
        CarDealershipSingleton.singleton = singleton;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carList = carsList;
    }
}
