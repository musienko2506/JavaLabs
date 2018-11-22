package com.kpi.laba2;

import java.util.Scanner;

public class View {


    public View(){

    }

    public String inputText() {

        System.out.println("Enter the text: ");
        String text;
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.useDelimiter("/").next();

        }
        System.out.println();
        return text;
    }
    public void outputText(String text){
        System.out.println(text);
    }
}
