package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private Phone phone;


    private ArrayList<Order> orders;
    private ArrayList<Menu> menus;



    public  Restaurant(String name, Phone phone, ArrayList<Order> orders,ArrayList<Menu> menus) {
        this.name = name;
        this.phone = phone;
        this.orders = orders;
        this.menus = menus;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void addMenu(String name, MenuType type,ArrayList<Dish> dishes){
        menus.add(new Menu(name, type,dishes));
    }

    @Override
    public String toString() {
        return "Restaurant {" +
                "Name='" + name + '\'' +
                ", Phone=" + phone +
                ", Orders=" + orders.toString() +
                ", Menus=" + menus.toString() +
                '}';
    }
}

