package org.example;

import org.example.Menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextId = 1;
    private int orderId;
    Table table;
    OrderStatus status;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Table table) {
        this.orderId = nextId++;
        this.table = table;
        this.status = OrderStatus.PENDING;
    }

    public static class OrderItem {

    }




    public void addItem(Menu menuItem, int quantity) {

    }

    public void calculateTotal() {

    }

    public void serve() {
        this.status = OrderStatus.SERVED;
    }


}
