package model;

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
    
    

    public void addMenu(Integer number, Menu menuX) {
        menus.put(number, menuX);
    }

}
