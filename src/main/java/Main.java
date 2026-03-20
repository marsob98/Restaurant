import org.example.Bill;
import org.example.Kitchen;
import org.example.Menu.Dessert;
import org.example.Menu.Drink;
import org.example.Menu.MainCourse;
import org.example.Menu.MenuItem;
import org.example.Order;
import org.example.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//
//        while (flag) {
//            System.out.println("MENU");
//            System.out.println("1. ");
//            System.out.println("2. ");
//            System.out.println("3. ");
//            System.out.println("4. ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 ->
//            }


        MenuItem pizza = new MainCourse("Nduja", 25.0, 15);
        MenuItem cola = new Drink("Cola", 5.0, 2);
        MenuItem lody = new Dessert("Lody", 12.0, 5);

        Table table = new Table(1, 4);
        table.occupy();
        Order order = new Order(table);
        order.addItem(pizza, 4);
        order.addItem(cola, 4);
        order.addItem(lody, 4);

        // kitchen
        Kitchen kitchen = new Kitchen();
        kitchen.addOrder(order);
        kitchen.startCooking();
        kitchen.markAsReady();


        // serve

        System.out.println(order.getStatus());

        order.serve();

        System.out.println(order.getStatus());
        // bill
        Bill bill = new Bill(order, 10.0);
        bill.takeBill();
        // free tabel
        System.out.println(table.getStatus());
        table.free();
        System.out.println(table.getStatus());
    }




}