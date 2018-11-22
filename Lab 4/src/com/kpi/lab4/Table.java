package com.kpi.lab4;

import java.util.ArrayList;

public class Table {
    private int id;
    private boolean isFree;
    private String owner;

    public Table(int id, boolean isFree, String owner) {
        this.id = id;
        this.isFree = isFree;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public static void printAllTables(ArrayList<Table> tables){
        System.out.println("№\t "+"Вільний?"+"\t "+"Прізвище замовника:"+"\t ");
        for (Table t:tables
             ) {

            System.out.print(t.id+"\t "+t.isFree+"\t\t\t "+t.owner);
            System.out.println();

        }
    }
}
