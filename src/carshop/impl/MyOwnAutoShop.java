package carshop.impl;

import carshop.cars.*;
import carshop.intface.*;

public class MyOwnAutoShop implements Admin, Customer {
    Car [] cars = new Car[]{
            new Sedan(200,false,4200,"Red",21),
            new Ford(250,false,5600,"Black",2005,0.3),
            new Ford(190,false,3200,"Blue",2000,0),
            new Truck(170,false,7300,"Green",2500),
            new Truck(210,false,5600,"White",1900)
    };

    @Override
    public double getIncome() {
        double income=0;
        for (Car car :cars){
            if(car.isSellOut()){
                income+=car.getSalePrice();
            }
        }
        return income;
    }

    @Override
    public void getCarsPrice() {
        System.out.println("There are cars prices: ");
        for (Car car :cars){
            if(!car.isSellOut()) {
                System.out.print(car.getSalePrice() + ", ");
            }
        }
        System.out.print("\n");
    }

    @Override
    public void getCarColors() {
        System.out.println("There are cars colors: ");
        for (Car car :cars){
            if(!car.isSellOut()){
                System.out.print(car.getColor()+", ");
            }
        }
        System.out.print("\n");
    }

    @Override
    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return cars[id].getColor();
    }

    @Override
    public void purchaseCar(int id) {
        cars[id].setSellOut(true);
    }
}
