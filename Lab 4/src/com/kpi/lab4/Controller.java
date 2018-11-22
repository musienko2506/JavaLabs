package com.kpi.lab4;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.jws.WebParam;

public class Controller {
    public Model model = new Model();
    public View view = new View();
    public void startProgram(){
        model.createRestaurant();
        view.menu();






    }
}
