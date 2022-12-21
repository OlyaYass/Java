package Pract29;

import Pract29.Item;

public interface Order {
    boolean addPosition(Item item);
    boolean remove(String dishName);
    int deleteAll(String name);
    int count();
    String[] getDishes();
    int costAll();
    int orderName(String name);
}