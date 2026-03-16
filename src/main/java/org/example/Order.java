package org.example;

import org.example.Menu.Menu;
import org.example.Menu.MenuItem;

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
        private MenuItem menuItem;
        private int quantity;

        public OrderItem(MenuItem menuItem, int quantity) {
            this.menuItem = menuItem;
            this.quantity = quantity;
        }

        public double subTotal() {
            return menuItem.getPrice() * quantity;
        }

        public MenuItem getMenuItem() {
            return menuItem;
        }

        public int getQuantity() {
            return quantity;
        }
    }




    public void addItem(MenuItem menuItem, int quantity) {
        OrderItem item = new OrderItem(menuItem, quantity);
        orderItems.add(item);

    }

    public void calculateTotal() {

    }

    public void serve() {
        this.status = OrderStatus.SERVED;
    }


}
