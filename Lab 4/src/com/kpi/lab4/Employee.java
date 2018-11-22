package com.kpi.lab4;

public class Employee {
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeOrder(Client client){
        System.out.println("Замовлення були прийняті!");
    }
}
