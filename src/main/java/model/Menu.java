package model;

import java.util.Objects;

public class Menu {
    private int number;
    private String menu;
    private String burger;
    private String fries;
    private String drink;
    private String gadget;

    private double price;

    public Menu(int number, String menu, String burger, String fries, String drink, String gadget, double price) {
        this.number = number;
        this.menu = menu;
        this.burger = burger;
        this.fries = fries;
        this.drink = drink;
        this.gadget = gadget;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getFries() {
        return fries;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getGadget() {
        return gadget;
    }

    public void setGadget(String gadget) {
        this.gadget = gadget;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu1 = (Menu) o;
        return number == menu1.number && Double.compare(menu1.price, price) == 0 && Objects.equals(menu, menu1.menu) && Objects.equals(burger, menu1.burger) && Objects.equals(fries, menu1.fries) && Objects.equals(drink, menu1.drink) && Objects.equals(gadget, menu1.gadget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, menu, burger, fries, drink, gadget, price);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "number=" + number +
                ", menu='" + menu + '\'' +
                ", burger='" + burger + '\'' +
                ", fries='" + fries + '\'' +
                ", drink='" + drink + '\'' +
                ", gadget='" + gadget + '\'' +
                ", price=" + price +
                '}';
    }
}