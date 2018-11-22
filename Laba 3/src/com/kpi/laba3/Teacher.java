package com.kpi.laba3;

import java.util.ArrayList;


public class Teacher {
    private String name;
    private String secondName;
    private String surname;
    private Enum gender;
    private ArrayList<String> disciplines = new ArrayList<>();
    private String department; //кафедра
    private String position; //посада


    public Teacher(String fullName, int gender, String disciplines, String department, String position) {

        String[] tempName = fullName.split(" ");
        this.secondName = tempName[0];
        this.name = tempName[1];
        this.surname = tempName[2];

        if(gender==1)
            this.gender = Gender.MALE;
        else
            this.gender=Gender.FEMALE;


        String[] tempDiscipline = disciplines.split(", ");
        for (String s:tempDiscipline) {
            this.disciplines.add(s);

        }

        this.department = department;
        this.position = position;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Enum getSex() {
        return gender;
    }
    public void setSex(Enum gender) {
        this.gender = gender;
    }
    public ArrayList<String> getDiscipline() {
        return disciplines;
    }
    public void setDiscipline(ArrayList<String> discipline) {
        this.disciplines = discipline;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getAllDisciplines(){

        return disciplines.toString();
    }



    public String toString(){
        System.out.format("%16s%16s%16s%16s%16s%16s%30s\n", secondName,name,surname,gender,department,position,getAllDisciplines());
        return this.secondName+" "+this.name+" "+this.surname+" \t\t"+this.gender+" \t\t"+this.department+" \t\t"+this.position+"   "+" \t\t"+getAllDisciplines();

    }
}
