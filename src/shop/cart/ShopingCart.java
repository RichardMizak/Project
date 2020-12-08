package shop.cart;

import shop.Item;
import shop.countable.Count;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
  private List<Item> list;

  public ShopingCart(){
      list=new ArrayList<>();
    }
    public void addItem(Item newItem){
    if (newItem.getItemPrice()>=0) {
      if (){newItem instanceof Count && ((Count))
    }
    list.add(newItem);
    }
    public int getCountOfItemsInCart(){
      return list.size();
    }
    public double getTotalPrice(){
    double total=0;
    for (Item temp:list){
      total=total+temp.getPrice();
    }
    return total;
    }
    public void printCart(){
      System.out.println("List of Items in my cart:");
      for (Item temp:list){
        System.out.println(" -  "+temp.toString());
      }
    }

}
