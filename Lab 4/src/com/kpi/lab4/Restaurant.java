package com.kpi.lab4;

public class Restaurant {
    public void createRestaurant(){

        SourceData.createAdmin();
        SourceData.createWaiter();
        SourceData.fillTables();
        SourceData.fillMenu();}
    }

