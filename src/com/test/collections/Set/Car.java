package com.test.collections.Set;

public class Car {

    private String brand;
    private String model;
    private int makeYear;
    private int price;
    private String color;

    public Car(){}

    public Car(String brand, String model, int makeYear, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.makeYear = makeYear;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
