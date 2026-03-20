package org.example;

public class Table {
    private int number;
    private int size;
    private TableStatus status;
    private Order currentOrder;

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
        currentOrder = null;
    }

    public boolean isOccupied() {
        return status == TableStatus.OCCUPIED;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;

    }

    public int getNumber() {
        return number;
    }

    public int getSize() {
        return size;
    }

    public TableStatus getStatus() {
        return status;
    }
}
