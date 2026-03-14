package org.example;

public class Table {
    int number;
    int size;
    TableStatus status;

    boolean occupied;

    public void occupy() {
        this.status = TableStatus.OCCUPIED;
    }
    public void free() {
        this.status = TableStatus.FREE;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Table(int number, int size) {
        this.number = number;
        this.size = size;
    }
}
