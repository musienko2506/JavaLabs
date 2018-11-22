package com.kpi.lab4;

import java.util.Scanner;
import static com.kpi.lab4.SourceData.clients;
import java.util.StringTokenizer;

public class Client {

    static Waiter waiter = SourceData.createWaiter();
    private Table tableID;
    private String name;
    public Client(){
       // this.tableID = tableID;
    }
    public static void orderTable(){
        int tableID;
        String surname;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уведіть ваше прізвище: ");
        surname = scanner.nextLine();
        System.out.println("На ваше прізвище буде замовлений столик!");
        tableID = Admin.takeOrder(surname);
        if(tableID>0) System.out.println("\tВаш столик під номером "+ tableID);
        else System.out.println("Пробачте, зараз вільних столиків немає.");


    }
    public static void makeOrder(Client client){


        waiter.takeOrder(client);



    }
    public  void payOrder(int tableID){
        waiter.payOrder(tableID);
        System.out.println("Дякуємо за оплату!");
    }
    public  void statusOrder(){
        System.out.println("Номер вашого столика?");
        Scanner scanner = new Scanner(System.in);
        int numberTable = scanner.nextInt();
        Model.statusOrder(numberTable);
    }

    public Table getTableID() {
        return tableID;
    }

    public void setTableID(Table tableID) {
        this.tableID = tableID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void freeUpTable(int tableID){
        Model.freeUpTable(tableID);
    }
}
