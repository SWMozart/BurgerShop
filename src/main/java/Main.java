import model.Menu;
import service.OrderSystem;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(1,"Small Menu", "Burger", "small Fries", "small Softdrink", "", 3.00);
        Menu menu2 = new Menu(2,"Medium Menu", "Burger", "Fries", "Softdrink", "", 4.50);
        Menu menu3 = new Menu(3,"Big Menu", "Boss Burger", "Fries", "Softdrink", "", 5.00);
        Menu menu4 = new Menu(4,"Kid Menu", "Kid Burger", "small Fries", "Caprisun", "Toy", 2.50);
        Menu menu5 = new Menu(5,"Boss Menu", "2 Boss Burger", "Cheese Fries", "Whisky", "Zigarre" , 9.99);

        OrderSystem orderSystem = new OrderSystem();

        orderSystem.addMenu(menu1);
        orderSystem.addMenu(menu2);
        orderSystem.addMenu(menu3);
        orderSystem.addMenu(menu4);
        orderSystem.addMenu(menu5);

        orderSystem.placeOrder(5);

    }
}
