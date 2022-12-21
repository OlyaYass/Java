package Pract29;

import Pract29.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderExceptions {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("Pasta: Carbonara - 490");
        dish.add("Pasta: Lasagna - 500");
        dish.add("Pizza: Pepperoni - 470");
        dish.add("Pizza: 4 cheeses - 490");
        dish.add("Salad: Caesar - 340");
        dish.add("Water: Still, Sparkling - 120");
        dish.add("Juice: Orange, Apple, Cherry - 190");
        dish.add("Beer: Light, Dark - 300");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Pasta", "Lasagna", 500));
        restaurantOrder.addPosition(new Drink("Juice", "Cherry", 190));
        System.out.println("\nPositions in the order: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));
        System.out.println("Order price: " + restaurantOrder.costAll());

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("Salad", "Caesar", 340));
        restaurantOrder1.addPosition(new Dish("Pasta", "Carbonara", 490));
        restaurantOrder1.addPosition(new Drink("Juice", "Orange", 190));
        System.out.println("\nPositions in the order: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));
        System.out.println("Order price: " + restaurantOrder1.costAll());

        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.getOrders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("Pizza", "Pepperoni", 470));
        internetOrder.addPosition(new Dish("Pizza", "4 cheeses", 490));
        System.out.println("\n" + "Internet orders: ");
        orderManager.add(internetOrder, "Moscow");
        System.out.println(orderManager.getInternetOrder());

    }
}