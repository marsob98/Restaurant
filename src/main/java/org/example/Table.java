package org.example;

public class Table {
    int number;
    int size;
    TableStatus status;
    Order currentOrder;

    public Table(int number, int size) {
        this.number = number;
        this.size = size;
        status = TableStatus.FREE;
        currentOrder = null;
    }

    public void occupy() {
        if (status == TableStatus.OCCUPIED) {
            throw new IllegalArgumentException("Table is occupied");
        }
        this.status = TableStatus.OCCUPIED;
    }

    public void free() {
        this.status = TableStatus.FREE;
    }

    public boolean isOccupied() {
        return status == TableStatus.OCCUPIED;
    }
}
