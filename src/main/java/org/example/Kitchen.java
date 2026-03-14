package org.example;

import java.util.Queue;

public class Kitchen {
    OrderStatus status;


    public void addOrder() {

    }
    public void startCooking() {
        this.status = OrderStatus.IN_PROGRESS;
    }
    public void markAsReady() {
        this.status = OrderStatus.READY;
    }

}
