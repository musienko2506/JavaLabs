package com.kpi.laba3;
import java.util.List;
import java.util.Scanner;

public class View {
    Model model = new Model();
    public void menu(){
        while (true) {
            System.out.println("\n\t*** Виберіть пункт меню: ***\n 1. Отримати список викладачів кафедри. \n " +
                    "2. Отримати список викладачів за " +
                    "дисципліною\n 3. Отримати список викладачів-жінок, що займають посаду доцента \n 4. " +
                    "Додати викладача \n 5. Отримати список всіх викладачів. \n 0. Вихід ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int key = scanner.nextInt();

                switch (key) {
                    case 1:
                        someItem(1);
                        break;
                    case 2:
                        someItem(2);
                        break;
                    case 3:
                        someItem(3);
                        break;
                    case 4:
                        someItem(4);
                        break;
                    case 5:
                        someItem(5);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\t!!! Виберіть пункт меню !!!");
                }
            }
            else System.out.println("\t!!! Ви вели не число !!!");
        }
    }

    public void someItem(int key){
        if (key==1) print(model.firstItem());
        else if(key==2)print(model.secondItem());
        else if(key==3) print(Model.thirdItem());
        else if(key==4)SourceData.createTeacher();
        else if(key==5)print(SourceData.teachersList);
        else{}

        }

    public void print(List<Teacher> teachList){
        for (Teacher t:teachList) {
            t.toString();

        }
    }


}
