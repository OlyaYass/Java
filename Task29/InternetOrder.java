package Pract29;

import java.util.*;

public class InternetOrder implements Order {
    List<Item> list = new ArrayList<>();

    public boolean addPosition(Item item) {
        return list.add(item);
    }

    public boolean remove(String dishName) {
        return list.remove(dishName);
    }

    public int deleteAll(String name) {
        int k=0;
        for (int i=0; i<list.size(); i++)
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
                k++;
            }
        return k;
    }

    public int count() {
        return list.size();
    }

    public String[] getDishes() {
        String[] str = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            str[i] = list.get(i).getName() + " " + list.get(i).getDescription() + " " + list.get(i).getCost();
        }
        return str;
    }

    public int costAll() {
        int sum = 0;
        for (int i=0; i< list.size(); i++)
            sum += list.get(i).getCost();
        return sum;
    }

    public int orderName(String name) {
        int k = 0;
        while (list.contains(name)) {
            k++;
        }
        return k;
    }
}
