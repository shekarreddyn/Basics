package com.test.collections.Sorting.Map;

        import java.util.Map;
        import java.util.Set;
        import java.util.TreeMap;

public class CarSorting {

    public static void main(String[] args) {

        CarComparator cc = new  CarComparator();

        Map<Car, Integer> mapCar = new TreeMap<Car, Integer>(cc);
        Car c1 = new Car("Hundai", "Verna", 24000,  "Red", 2014);
        Car c2 = new Car("Mercedes", "Class-C", 58000, "Black", 2018 );
        Car c3 = new Car("Honda", "Accord", 36000, "Red", 2014);
        Car c4 = new Car("Ford", "Fiesta", 28000, "Silver", 2017);
        Car c5 = new Car("Lexus", "A13", 40000, "White", 2016);
        Car c6 = new Car("Toyota", "Camry", 28000, "Black", 2009);
        Car c7 = new Car("Chrysler", "C22", 32000, "Blue", 2010);
        Car c8 = new Car("Audi", "A4", 46000, "Black", 2013);

        mapCar.put(c1, 3);
        mapCar.put(c2, 1);
        mapCar.put(c3, 5);
        mapCar.put(c4, 6);
        mapCar.put(c5, 4);
        mapCar.put(c6, 8);
        mapCar.put(c7, 7);
        mapCar.put(c8, 2);

       Map<Integer, Car> mapCars = new TreeMap<Integer, Car>();
        Set<Map.Entry<Car, Integer>>  entries = mapCar.entrySet();
        for (Map.Entry<Car, Integer> entry: entries) {
            mapCars.put(entry.getValue(), entry.getKey());

        }

       Set<Integer> keyset = mapCars.keySet();
        for (Integer k: keyset) {
            System.out.println(mapCars.get(k).getBrand() +" :" + k) ;
        }

      /*  Set<Car> car = mapCar.keySet();

        for(Car prop:car) {
            System.out.println(prop.getPrice());
        }*/
    }
}
