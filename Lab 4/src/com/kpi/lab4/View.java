package com.kpi.lab4;

import java.util.Scanner;

public class View {
    Model model = new Model();

    public static void menu() {
        while (true) {
            System.out.println("\n\t*** Хто ви?: ***\n 1. Клієнт. \n 2. Офіціант\n 3. Адміністратор\n 0. Вихід ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int key = scanner.nextInt();

                switch (key) {
                    case 1:
                        Model.clientItem();
                        break;
                    case 2:
                        Model.waiterItem();
                        break;
                    case 3:
                        Model.adminItem();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\t!!! Виберіть пункт меню !!!");
                }
            } else System.out.println("\t!!! Ви вели не число !!!");
        }
    }




}