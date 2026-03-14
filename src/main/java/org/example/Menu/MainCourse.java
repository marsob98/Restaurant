package org.example.Menu;

public class MainCourse extends MenuItem {

    public MainCourse(String name, double price, int prepTime) {
        super(name, price, prepTime);
    }

    @Override
    public String getDescription() {
        return "Danie główne " + name;
    }
}
