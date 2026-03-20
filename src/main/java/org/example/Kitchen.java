package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Kitchen {
    private Queue<Order> orderQueue = new LinkedList<>();
    private Order currentOrder = null;


    public void addOrder(Order order) {
       order.setStatus(OrderStatus.PENDING);
              orderQueue.add(order);

    }
    public void startCooking() {
        if (currentOrder != null) {
            System.out.println("Kitchen is busy! Currently preparing order #" + currentOrder.getOrderId());
            return;
        }

        currentOrder = orderQueue.poll();

        if (currentOrder != null) {
            currentOrder.setStatus(OrderStatus.IN_PROGRESS);
            System.out.println("Started cooking order #" + currentOrder.getOrderId());
        } else {
            System.out.println("No orders in queue!");
        }

    }
    public void markAsReady() {
        if (currentOrder == null) {
            System.out.println("There's no order in kitchen");
        }

        currentOrder.setStatus(OrderStatus.READY);
        System.out.println("Order #" + currentOrder.getOrderId() + " is ready");

        currentOrder = null;
    }

}
