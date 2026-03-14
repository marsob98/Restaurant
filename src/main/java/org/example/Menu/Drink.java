package org.example.Menu;

public class Drink extends MenuItem {

    public Drink(String name, double price, int prepTime) {
        super(name, price, prepTime);
    }

    @Override
    public String getDescription() {
        return "Napój " + name;
    }
}
