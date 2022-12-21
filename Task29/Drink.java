package Pract29;

public class Drink implements Item {
    private int cost;
    private  String name, description;

    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        if (cost == 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}