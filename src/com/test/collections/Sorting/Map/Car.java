package com.test.collections.Sorting.Map;


public class Car {

    private String brand;
    private String Model;
    private int Price;
    private String color;
    private int year;

    public Car() {}

    public Car(String brand, String model, int price, String color, int year) {
        super();
        this.brand = brand;
        Model = model;
        Price = price;
        this.color = color;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


}
