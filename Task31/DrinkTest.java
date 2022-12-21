package Pract31;

import Pract29.Drink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Drink drink;

    @BeforeEach
    public void createDrink() {
        drink = new Drink("Juice", "Orange", 190);
    }

    @Test
    void testGetCost() {
        assertEquals(190,drink.getCost());
    }

    @Test
    void testGetDescription() {
        assertEquals("Orange", drink.getDescription());
    }

    @Test
    void getName() {
        assertEquals("Juice", drink.getName());
    }
}
