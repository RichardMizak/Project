package shop;

import shop.cart.ShopingCart;
import shop.countable.Chocolate;
import shop.countable.Water;
import shop.coupon.CheckCoupons;
import shop.coupon.Reader;
import shop.uncountable.Apple;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShopingCart cart=new ShopingCart();
        Apple item1=new Apple(1.19,"Golden",1.5);
        Item item2=new Water(0.99,"Kofola",6);
        Water item3=new Water(1.29,"Tonic",1);
        Chocolate item4=new Chocolate(0.99,"Milka",3);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        double totalPrice= cart.getTotalPrice();

        cart.printCart();
        System.out.println();
        System.out.println("Price in SK: "+Util.convertor(cart.getTotalPrice()) );
        System.out.println("Price in €: "+Util.formalPrice(cart.getTotalPrice()));

        System.out.println("Do you have any coupon (y/n) ?");
        Scanner scanner=new Scanner(System.in);
        String coupon;
        String input = scanner.nextLine().toLowerCase();
        if(input.charAt(0)=='y'){
            System.out.println("Enter coupon code: ");
            coupon=scanner.nextLine();
            List<CheckCoupons> list= Reader.getListOfCouponsFromFile();
            totalPrice= cart.getTotalPrice();
            for (CheckCoupons temp:list){
                if (temp.getCode().equalsIgnoreCase(coupon));
                System.out.println("Coupon is valid.");
                System.out.println();
            }

        }
        System.out.println("Total price: "+cart.getTotalPrice() );
        System.out.println("Price in SK: "+Util.convertor((cart.getTotalPrice())));
    }
}
