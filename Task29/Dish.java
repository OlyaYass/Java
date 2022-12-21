package Pract29;

public final class Dish implements Item {
    private int cost;
    private String name, description;

    public Dish(String name, String description, int cost) throws IllegalArgumentException{
        if (cost == 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}