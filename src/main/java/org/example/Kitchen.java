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


    }
    public void markAsReady() {
        currentOrder.setStatus(OrderStatus.READY);
    }

}
