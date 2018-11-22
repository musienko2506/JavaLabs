package com.kpi.lab4;

import javax.swing.event.CaretListener;
import java.util.ArrayList;
import java.util.Scanner;

public class SourceData {
    public static void createAdmin() {
        Admin admin = new Admin("Віталій Сергійович");
    }
    public static Waiter createWaiter(){
        Waiter waiter = new Waiter("Андрій");
        return waiter;
    }
    public static Client createClient(){
        Client client = new Client();
        return client;
    }
    public static ArrayList<Client> clients = new ArrayList<>();
    public static ArrayList<Dish> menu = new ArrayList<>();
    public static void fillMenu(){
    Dish dish1 = new Dish(1,"Борщ", 20);
    menu.add(dish1);
    Dish dish2 = new Dish(2,"Вареники", 15);
    menu.add(dish2);
    Dish dish3 = new Dish(3,"Голубці", 23);
    menu.add(dish3);
    Dish dish4 = new Dish(4,"Картопля по селянськи", 25);
    menu.add(dish4);
    Dish dish5 = new Dish(5,"Картопля фрі", 30);
    menu.add(dish5);
    Dish dish6 = new Dish(6,"Плов", 27);
    menu.add(dish6);
    Dish dish7 = new Dish(7,"Кава", 12);
    menu.add(dish7);
    Dish dish8 = new Dish(8,"Чай", 7);
    menu.add(dish8);
    Dish dish9 = new Dish(9,"Печиво", 4);
    menu.add(dish9);
    Dish dish10 = new Dish(10,"Компот", 2);
    menu.add(dish10);



}

    public static void makeOrder(){


}
    public static ArrayList<Table> tables = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    public static void fillTables(){

        Table table1 = new Table(1,true, "");
        tables.add(table1);
        Table table2 = new Table(2,true, "");
        tables.add(table2);
        Table table3 = new Table(3,true, "");
        tables.add(table3);
        Table table4 = new Table(4,true, "");
        tables.add(table4);
        Table table5 = new Table(5,true, "");
        tables.add(table5);
        Table table6 = new Table(6,true, "");
        tables.add(table6);
        Table table7 = new Table(7,true, "");
        tables.add(table7);
        Table table8 = new Table(8,true, "");
        tables.add(table8);
        Table table9 = new Table(9,true, "");
        tables.add(table9);
        Table table10 = new Table(10,true, "");
        tables.add(table10);

}



}
