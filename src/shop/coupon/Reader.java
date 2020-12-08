package shop.coupon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader{
    private static String fileName="resource/coupon.txt";
    public static List<CheckCoupons> getListOfCouponsFromFile(){
        List<CheckCoupons> list=new ArrayList<>();
        try {
            File file=new File(fileName);
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String data=scanner.nextLine();
                String[] array=data.split(" ");
                CheckCoupons newCoupon=new CheckCoupons(array[0],Integer.parseInt(array[1]));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
return list;
    }
}
