package me.jramun.model;

public class Car {

    private final Integer id;
    private final String name;
    private final String price;


    public Car(Integer id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
