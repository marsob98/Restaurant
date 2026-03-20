package org.example.Menu;

public abstract class MenuItem implements Menu {
    protected String name;
    protected double price;
    protected int prepTime; // min

    public MenuItem(String name, double price, int prepTime) {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPrepTime() {
        return prepTime;
    }

}
