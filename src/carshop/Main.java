package carshop;

import carshop.impl.MyOwnAutoShop;
import analyse.*;
import lab5.abstct.*;
//import lab5.intface.*;
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
        System.out.println("\n");

        Person[] persons = new Person[]{
                new Person("Захарченко","Ленар",22),
                new Student("Полюнько","Олег",18,212,345874),
                new Lecturer("Задерейко","Александр",54,"IT",15000),
                new Student("Щербина","Игорь",19,212,593845),
                new Student("Дыбчук","Алексей",19,212,198567),
                new Person("Андреев","Мирослав",12),
                new Lecturer("Чепурна","Елена",45,"Math",12000)
        };

        for (Person person : persons)
        {
            System.out.println(person.printInfo());
        }
    }
}