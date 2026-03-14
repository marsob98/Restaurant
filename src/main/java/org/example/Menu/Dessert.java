package org.example.Menu;

public class Dessert extends MenuItem {


    public Dessert(String name, double price, int prepTime) {
        super(name, price, prepTime);
    }

    @Override
    public String getDescription() {
        return "Deser " + name;
    }
}
