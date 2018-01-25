package com.test.collections.Set;

import java.util.*;
import java.util.TreeSet;

public class SortingCar {
    public static void main(String[] args) {

        List<Car> carSet = new ArrayList<Car>();

        Car c1 = new Car("Toyota", "Camry", 2014, 26000, "Grey");
        Car c2 = new Car("Audi", "A6",2016,44000,"Black");
        Car c3 = new Car("Honda", "Accord", 2010, 32000, "Red");
        Car c4 = new Car("Hyundai", "Verna", 2014, 28000, "Brown");
        Car c5 = new Car("BMW", "X5", 2013, 48000,"Blue");
        Car c6 = new Car("RangeRover", "Evoque", 2018, 42000, "Silver");

        carSet.add(c1);
        carSet.add(c2);
        carSet.add(c3);
        carSet.add(c4);
        carSet.add(c5);
        carSet.add(c6);

       CarComparator cc = new CarComparator();

        Collections.sort(carSet, cc);

     /*   Collections.sort(carSet, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });*/

        for (Car Value:carSet) {
            System.out.println(Value.getMakeYear()+":"+ Value.getBrand() );
        }

    }
}
