package com.kpi.lab4;

import java.util.ArrayList;

public class Dish {
    private int id;
    private String name;
    private double cost;
    public Dish(int id, String name, double cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static void printMenu(ArrayList<Dish>dishes){
        for (Dish d:dishes
             ) {
            System.out.format("%4d%30s%20.2f", d.id, d.name, d.cost);
           // System.out.print(d.id+"\t "+d.name+"\t\t "+d.cost);
            System.out.println();

        }
    }
}
