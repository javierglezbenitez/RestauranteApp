package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {

    private String name;
    private String surname;
    private ArrayList<Order> orders;
    private Address address;

    public Customer(String name, String surname,String street, int number, int postalCode, String city, ArrayList<Order> orders) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.orders = orders;
    }




    public ArrayList<Order> getOrders() {
        return orders;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street,  int number, int postalCode, String city) {
        this.address = new Address( street,   number,  postalCode,  city);

    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(address, customer.address)&& Objects.equals(orders, customer.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, orders);
    }

    @Override
    public String toString() {
        return "Customer {" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Orders=" + orders.toString() +
                ", Address=[" + address.toString() +
                '}';
    }
}

