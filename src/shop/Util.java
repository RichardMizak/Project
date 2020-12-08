package shop;

public class Util {
    public static double convertor(double value){
        return value*30.126;
    }
    public static double formalPrice(double price) {
        double result=(double) Math.round(price*100)/100;
        return result;

    }
}
