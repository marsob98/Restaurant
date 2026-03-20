package org.example;

public class Bill {
    private Order order;
    private double tip;

    public Bill(Order order, double tip) {
        this.order = order;
        this.tip = tip;
    }

    private double calculateBill(Order order, double tip) {
        return order.calculateTotal() + tip;
    }

    public void takeBill() {
        for (Order.OrderItem item : order.getOrderItems()) {
            System.out.printf("%s  x%d - %.2f zł%n",
                    item.getMenuItem().getName(),
                    item.getQuantity(),
                    item.getSubTotal());
        }
    }

}
