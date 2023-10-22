package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderItem {
    private int quantity;



    public OrderItem(int quantity ) {

        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                '}';
    }
}

