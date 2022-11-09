package carshop;

import carshop.impl.MyOwnAutoShop;
import analyse.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop shop= new MyOwnAutoShop();
        shop.getCarColors();
        shop.getCarsPrice();
        System.out.println(shop.getIncome());
        System.out.println(shop.getCarPrice(3));
        System.out.println(shop.getCarColor(3));
        shop.purchaseCar(3);
        System.out.println(shop.getIncome());

        StrLowcase lcAnalyser=new StrLowcase();
        StrUpcase ucAnalyser=new StrUpcase();

        System.out.println("Enter string: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print("Lowcase characters in your string: " + lcAnalyser.analyse(str));
        System.out.println("\n");
        System.out.print("Upcase characters in your string: " + ucAnalyser.analyse(str));
    }
}