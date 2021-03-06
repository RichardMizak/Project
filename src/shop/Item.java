package shop;

import shop.cart.ShopingCart;

public abstract class Item extends ShopingCart {

    private double price;
    private String name;

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public abstract double getItemPrice();
}
