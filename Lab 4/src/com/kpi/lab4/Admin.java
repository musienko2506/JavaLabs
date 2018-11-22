package com.kpi.lab4;

public class Admin extends Employee {

    public Admin(String name){
        super(name);
    }

    public void createMenu(){
    Model.addDish();
    }
    public static int takeOrder(String surname){
     return Model.orderTable(surname);

    }

    public void seeFreeTables(){
    Model.seeFreeTables();
    }
}
