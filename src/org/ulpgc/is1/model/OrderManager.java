package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private ArrayList<Customer> customers;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Dish> dishes;
    private ArrayList<Order> orders;

    public OrderManager() {
        customers = new ArrayList<>();
        restaurants = new ArrayList<>();
        dishes = new ArrayList<>();
        orders = new ArrayList<>();
    }



    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city, ArrayList<Order> orders){
        Customer customer = new Customer(name, surname, street, number, postalCode, city, orders);
        customers.add(customer);
        if (!customers.contains(customer)) customers.add(customer);
    }

    public void addRestaurant(String name, Phone phone,ArrayList<Order> orders,ArrayList<Menu> menus){
        Restaurant restaurant = new Restaurant(name, phone, orders,menus);
        restaurants.add(restaurant);
        if (!restaurants.contains(restaurant)) restaurants.add(restaurant);
    }

    public void addDish(String name, String description, int price){
        Dish dish = new Dish(name, description, price);
        dishes.add(dish);
        if (!dishes.contains(dish)) dishes.add(dish);

    }



    public List<Customer> getCustomer(){
        return customers;
    }

    public List<Restaurant> getRestaurant(){
        return restaurants;
    }

    public List<Dish> getDish(){
        return dishes;
    }

    public int countCustomer(){
        return customers.size();
    }

    public int countDish(){
        return dishes.size();
    }

    public int countRestaurants(){
        return restaurants.size();
    }
    public void removeRestaurants(int index){
        restaurants.remove(index);
    }

    public void removeDishes(int index){
        dishes.remove(index);
    }
    public void removeCustomer(int index){
        customers.remove(index);
    }

    //El order nos da error, esta indicado tambien en la clase main. No sabemos como hacerlo, aun asi ponemos lo que hicimos
    //public void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantities){
      //  Order neworder = new Order();
        //customer.addOrder(neworder);
        //for(int i = 0; i <dishesId.size();i++){
          //  int dishId = dishesId.get(i);
            //int quantity = quantities.get(i);
        //}
        //restaurant.addOrder(neworder);
    //}

}