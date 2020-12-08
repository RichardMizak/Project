package shop.uncountable;

import shop.Item;
import shop.Util;

public class Apple extends Item implements Weigth {
private double weigth;
    public Apple(double price, String name, double weigth) {
        super(price, name);
        this.weigth=weigth;
    }

    @Override
    public double getItemPrice() {
        return weigth*getPrice();
    }

    @Override
    public double getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        return "Apple: " +getName()+", Weigth: "+weigth+", Price per kg: "+getPrice()+", Price: "+ Util.formalPrice(getItemPrice());
    }
}

