package org.ulpgc.is1.model;

public class Dish {
    private String name;
    private String description;
    private int price;


    public Dish(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish[" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price + "]";
    }
}

