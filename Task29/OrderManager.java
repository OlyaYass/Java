package Pract29;

import Pract29.Order;
import Pract29.OrderExceptions;

import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Object> orderHashMap = new HashMap<Integer, Object>();
    HashMap<String, Object> orderHashMap1 = new HashMap<String, Object>();

    public void add(Order o, int table) throws OrderExceptions {
        String str = String.join(",", o.getDishes());
        if (table < 1 || table > 5)
            throw new OrderExceptions(table, 0);
        if (orderHashMap.containsKey(table))
            throw new OrderExceptions(table);
        else orderHashMap.put(table, str);
    }
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }
    public void removeOrder(int table){
        orderHashMap.remove(table);
    }
    public HashMap getOrders(){
        return orderHashMap;
    }

    public void add(Order o, String address) {
        String str = String.join(",", o.getDishes());
        orderHashMap1.put(address, str);
    }
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }

    public int sumOrders() {
        return orderHashMap.size() + orderHashMap1.size();
    }
}