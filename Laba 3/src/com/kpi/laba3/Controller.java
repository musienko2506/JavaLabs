package com.kpi.laba3;

public class Controller {
    public Controller(){}
    public Model model = new Model();
    public View view = new View();

    public void startProgram(){
        model.fillData();
        view.menu();

    }
}
