import org.example.Bill;
import org.example.Kitchen;
import org.example.Menu.Dessert;
import org.example.Menu.Drink;
import org.example.Menu.MainCourse;
import org.example.Menu.MenuItem;
import org.example.Order;
import org.example.Table;

public class Main {
    public static void main(String[] args) {
        MenuItem pizza = new MainCourse("Nduja", 25.0, 15);


        MenuItem cola = new Drink("Cola", 5.0, 5);


        MenuItem lody = new Dessert("Lody", 12.0, 15);


        Table table = new Table(1, 4);

        table.occupy();

        Order order = new Order(table);
        order.addItem(pizza, 2);
        order.addItem(cola, 2);
        order.addItem(lody, 2);




    }
}