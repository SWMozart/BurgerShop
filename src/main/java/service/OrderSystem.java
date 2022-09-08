package service;

import model.Menu;

import java.util.HashMap;
import java.util.Map;

public class OrderSystem {

    Map<Integer, Menu> menus = new HashMap<>();

    public OrderSystem() {
        
    }

    public Map<Integer, Menu> getMenus() {
        return menus;
    }

    public void setMenus(Map<Integer, Menu> menus) {
        this.menus = menus;
    }
    
    

    public void addMenu(Menu menuX) {
        menus.put(menuX.getNumber(), menuX);
    }

    public Menu placeOrder(Integer number){
        Menu foundMenu = menus.get(number);
        System.out.println(foundMenu);

        return foundMenu;
    }

}
