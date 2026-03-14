package org.example;

public class Table {
    int number;
    int size;

    boolean occupied;

    public void occupy() {

    }
    public void free() {

    }

    public boolean isOccupied() {
        return occupied;
    }

    public Table(int number, int size) {
        this.number = number;
        this.size = size;
    }
}
