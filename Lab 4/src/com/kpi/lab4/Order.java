package com.kpi.lab4;

import java.util.ArrayList;

public class Order {
    private Table tableID;
    private ArrayList<Dish> dishes = new ArrayList<>();
    private double sum;
    private boolean isPaid;
    private boolean isDone;
    private boolean isAccepted;
    public Order(Table table, ArrayList<Dish> dishes, double sum,boolean isAccepted, boolean isDone, boolean isPaid ){
    this.tableID = table;
    this.dishes = dishes;
    this.sum = sum;
        this.isAccepted = isAccepted;

    this.isDone = isDone;
        this.isPaid = isPaid;

    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public  String getAllDishes(){
        StringBuffer strDish = new StringBuffer();
        for (Dish d:dishes) {
       //     d.setId(d.getId()-1);
            strDish.append(" "+d.getName());
        }

        return strDish.toString();
    }
    public  void printOrder(Order order){
        System.out.println("Столик: "+(order.tableID.getId())+"\n"+"Страви: "+getAllDishes()+
                "\n"+"Сума: "+order.sum+"\n"+"Прийнято: "+order.isAccepted+"\n"+"Виконано: "+order.isDone+"\n"+"Сплачено: "+order.isPaid);
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public Table getTableID() {
        return tableID;
    }

    public void setTableID(Table tableID) {
        this.tableID = tableID;
    }



    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }


}
