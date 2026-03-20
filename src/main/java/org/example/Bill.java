package org.example;

public class Bill {
    private Order order;
    private double tip;

    public Bill(Order order, double tip) {
        this.order = order;
        this.tip = tip;
    }


    public void takeBill() {
        System.out.println("Table #" + order.getTable().getNumber());
        System.out.println("Order #" + order.getOrderId());
        System.out.println("Your total order: ");

        for (Order.OrderItem item : order.getOrderItems()) {
            System.out.printf("%s  x%d - %.2f zł%n",
                    item.getMenuItem().getName(),
                    item.getQuantity(),
                    item.getSubTotal());
        }
        System.out.println("In total: " + order.calculateTotal() + tip);

    }

}
