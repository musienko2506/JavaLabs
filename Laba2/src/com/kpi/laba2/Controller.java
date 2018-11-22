package com.kpi.laba2;

public class Controller {

    public Controller(){}
    public Model model;
    public View view = new View();

    public void startProgram(){
        model = new Model(view.inputText());
        System.out.println("BEFORE: ");
        view.outputText(model.getText());
        model.editText();
        System.out.println("\n"+"AFTER: ");
        view.outputText(model.getText());




    }
}
