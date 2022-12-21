package Pract29;

public class OrderExceptions extends Exception {
    public OrderExceptions(int ex) {

        super("Order is already added at " + ex + " table");
    }

    public OrderExceptions(int ex, int i) {

        super("Don't exist " + ex + " table");
    }
}