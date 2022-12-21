package Pract31;

import Pract29.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {
    OrderManager orderManager;
    RestaurantOrder restaurantOrder;

    @BeforeEach
    public void createOrder() {
        restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Pasta", "Lasagna", 500));
        orderManager = new OrderManager();
    }

    @Test
    void testNonExistentTableAdd() {
        Exception exception = assertThrows(Exception.class, () -> {
            orderManager.add(restaurantOrder, 10);
        });

        assertEquals("Don't exist 10 table",exception.getMessage());
    }

    @Test
    void testRepeatingTableAdd() throws OrderExceptions {
        orderManager.add(restaurantOrder, 1);
        Exception exception = assertThrows(Exception.class, () -> {
            orderManager.add(restaurantOrder, 1);
        });

        assertEquals("Order is already added at 1 table", exception.getMessage());
    }

}