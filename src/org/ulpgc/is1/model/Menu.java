package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private MenuType type;
    private ArrayList<Dish> dishes;

    public Menu(String name, MenuType type,ArrayList<Dish> dishes) {
        this.name = name;
        this.type = type;
        this.dishes = dishes;
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", type=" + type +
                        ", Dishes=" + dishes.toString() ;
    }
}

