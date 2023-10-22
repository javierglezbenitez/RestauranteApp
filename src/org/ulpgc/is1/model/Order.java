package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {

    private static int NEXT_ID = 0;

    public final int id;

    private ArrayList<OrderItem> orderItems;




    public Order(int id, ArrayList<OrderItem> orderItems) {
        this.id = NEXT_ID++;
        this.orderItems = orderItems;

    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public void setNEXT_ID(int NEXT_ID) {
        this.NEXT_ID = NEXT_ID;
    }

    public int getId() {
        return id;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.orderItems = orderItems;
    }


    public void addItems(int quantity){
        OrderItem item = new OrderItem(quantity);
        orderItems.add(item);
    }

    void delItems(int index){
        orderItems.remove(index);
    }


    public int price(Dish dish, OrderItem orderItem){
        return dish.getPrice() * orderItem.getQuantity();    }



    @Override
    public String toString() {
        return
                "id=" + id +
                        ", orderItems=" + orderItems.toString() ;
    }

}
