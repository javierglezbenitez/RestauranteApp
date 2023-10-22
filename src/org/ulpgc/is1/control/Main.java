package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);

    }


    public static void init(OrderManager orderManager) {
        // Crear dos clientes:
        ArrayList<OrderItem> orderItem1 = new ArrayList<>();
        ArrayList<OrderItem> orderItem2 = new ArrayList<>();
        ArrayList<Order> orders1 = new ArrayList<>();
        ArrayList<Order> orders2 = new ArrayList<>();
        Dish dish1 = new Dish("Pescado", "Troceado con alioli", 11);
        Dish dish2 = new Dish("Carne", "Con papas y arroz", 16);
        OrderItem orderItem = new OrderItem(12);
        OrderItem orderItem_ = new OrderItem(5);
        Order order = new Order(1, orderItem1);
        Order order1 = new Order(2, orderItem2);
        orderItem1.add(orderItem);
        orders1.add(order);
        orderItem2.add(orderItem_);
        orders2.add(order1);

        Customer customer1 = new Customer("Javier", "Gonzalez", "Avenidad Mar", 3, 12, "Las Palmas", orders1);
        Customer customer2 = new Customer("Jorge", "Gomez", "Siete Palmas", 1, 2, "Las Lluvias", orders2);
        orderManager.addCustomer("Javier", "Gonzalez", "Avenidad Mar", 3, 12, "Las Palmas", orders1);
        orderManager.addCustomer("Jorge", "Gomez", "Siete Palmas", 1, 2, "Las Lluvias", orders2);

        //Crear dos restaurantes:
        ArrayList<Dish> dishes1 = new ArrayList<>();
        ArrayList<Dish> dishes2 = new ArrayList<>();
        ArrayList<Menu> menus1 = new ArrayList<>();
        ArrayList<Menu> menus2 = new ArrayList<>();
        Menu menu1 = new Menu("Grande", MenuType.Kids, dishes1);
        Menu menu2 = new Menu("Mediano", MenuType.Daily, dishes2);
        dishes1.add(dish1);
        menus1.add(menu1);
        dishes2.add(dish2);
        menus2.add(menu2);

        Phone phone1 = new Phone("123456789");
        Phone phone2 = new Phone("1234asz");
        Restaurant restaurant1 = new Restaurant("Goiko", phone1, orders1, menus1);
        Restaurant restaurant2 = new Restaurant("Koki", phone2, orders2, menus2);


        orderManager.addRestaurant("Goiko", phone1, orders1, menus1);
        orderManager.addRestaurant("Koki", phone2, orders2, menus2);


        //Crear tres platos:
        Dish dish5 = new Dish("Arroz", "Con setas", 12);
        Dish dish6 = new Dish("Sopa", "Con verduras", 5);
        Dish dish7 = new Dish("Bistec", "Con  judias", 20);


        orderManager.addDish("Arroz", "Con setas", 12);
        orderManager.addDish("Sopa", "Con verduras", 5);
        orderManager.addDish("Bistec", "Con  judias", 20);

        // Imprimir por pantalla los datos del primer restaurante:
        System.out.println(orderManager.getRestaurant().get(0).toString());

        //Imprimimos un restaurant con telefono invalido para comprobar que funciona el metodo isValid()
        System.out.println(orderManager.getRestaurant().get(1).toString());

        //Imprimir por pantalla los datos del segundo cliente.
        System.out.println(orderManager.getCustomer().get(1).toString());

        //Imprimir por pantalla los datos del tercer plato.
        System.out.println(orderManager.getDish().get(2).toString());


        //Crear un pedido por parte del primer cliente, al primer restaurante, que incluya los dos últimos platos del catálogo.
        //Este apartado nos da un error que no supimos corregir, no obstante ponemos lo que hicimos.
        //orderManager.order(customer1, restaurant1, dishes1,orderItem1 );

        //Borrar el segundo cliente.
        orderManager.removeCustomer(1);

        //Imprimir por pantalla el número de clientes.
        System.out.println(orderManager.countCustomer());

        //Imprimir por pantalla el primer pedido del primer cliente, incluyendo precio total del pedido.
        System.out.println(orderManager.getCustomer().get(0).getOrders().get(0).toString() + ", Precio=" + orderManager.getCustomer().get(0).getOrders().get(0).price( dish1, orderItem));





    }

}