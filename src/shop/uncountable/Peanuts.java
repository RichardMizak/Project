package shop.uncountable;

import shop.Item;
import shop.Util;

public class Peanuts extends Item implements Weigth {
private double weigth;
    public Peanuts(double price, String name, double weigth) {
        super(price, name);
        this.weigth=weigth;
    }

    @Override
    public double getItemPrice() {
        return weigth*getItemPrice();
    }

    @Override
    public double getWeigth() {
        return weigth;
    }
    @Override
    public String toString() {
        return "Peanuts: " +getName()+", Weigth: "+weigth+", Price per kg: "+getPrice()+", Price: "+ Util.formalPrice(getItemPrice());
    }
}
