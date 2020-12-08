package shop.countable;

import shop.Item;
import shop.Util;

public class Chocolate extends Item implements Count {
private int count;
    public Chocolate(double price, String name, int count) {
        super(price, name);
        this.count=count;
    }

    @Override
    public double getItemPrice() {
        return count*getPrice();
    }

    @Override
    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "Chocolate: " +getName()+", Count: "+count+", Price per kg: "+getPrice()+", Price: "+ Util.formalPrice(getItemPrice());
    }
}
