package com.test.collections.Sorting.Map;

        import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        return c1.getPrice() - c2.getPrice();
    }

}
