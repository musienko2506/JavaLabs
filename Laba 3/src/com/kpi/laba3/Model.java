package com.kpi.laba3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.kpi.laba3.SourceData.teachersList;

public class Model {
    Scanner scanner = new Scanner(System.in);
    public  List<Teacher> firstItem(){
    System.out.println("\t*** Уведіть назву кафедри: ***");
    String department = scanner.nextLine();
    List<Teacher> tempList = new ArrayList<>();
    for (Teacher t:teachersList) {

        if (t.getDepartment().equalsIgnoreCase(department))
            tempList.add(t);
    }
    if (tempList.isEmpty()){
        System.out.println("\t Список порожній!");
    }
    return tempList;
}
    public  List<Teacher> secondItem(){
    System.out.println("\t*** Уведіть назву дисципліни: ***");
    String discipline = scanner.nextLine();
    List<Teacher> tempList = new ArrayList<>();
    for (Teacher t:teachersList) {
        for (String disc:t.getDiscipline()) {
            if(disc.equalsIgnoreCase(discipline))
                tempList.add(t);
        }
    }
    if (tempList.isEmpty()){
        System.out.println("\t Список порожній!");
    }
    return tempList;
}
    public static List<Teacher> thirdItem(){
    System.out.println("\t *** Список викладачів-жінок, які займають посаду доцент: ***");
    List<Teacher> tempList = new ArrayList<>();
    for (Teacher t:teachersList) {
        if (t.getSex().equals(Gender.FEMALE)&&t.getPosition().equalsIgnoreCase("доцент"))
            tempList.add(t);
    }
    if (tempList.isEmpty()){
        System.out.println("\t Список порожній!");
    }
    return tempList;
    }

    public void fillData(){
    SourceData.fillTeachersList();
    }
}
