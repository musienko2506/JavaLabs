package com.kpi.lab4;

import java.util.Scanner;

import static com.kpi.lab4.SourceData.clients;
import static com.kpi.lab4.SourceData.orders;
import static com.kpi.lab4.SourceData.tables;

public class Waiter extends Employee{
    public Waiter(String name){
        super(name);
    }
    public void takeOrder(Client client){

        System.out.println(" - Номер вашого столика? ");
        Scanner scanner = new Scanner(System.in);
        int tableID = scanner.nextInt()-1;
       // Client client = new Client(tables.get(tableID));
        //client = new Client();
        client.setTableID(tables.get(tableID));
        tables.get(tableID).setFree(false);
        clients.add(client);
        Model.takeOrder(client);
    }
   // public void takeOrder(){

     //   System.out.println("Всі замовлення було прийнято!");
 //   }
    public void payOrder(int tableID){

        Model.payOrder(tableID);
    }
    public  void doOrder(){
        Model.doOrder();
        System.out.println("Всі замовлення було виконано!");
    }
}
