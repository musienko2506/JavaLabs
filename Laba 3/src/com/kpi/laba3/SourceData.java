package com.kpi.laba3;

import java.util.ArrayList;
import java.util.Scanner;

import static com.kpi.laba3.Teacher.*;

public class SourceData {
    public static ArrayList<Teacher> teachersList = new ArrayList<>();
    public static void fillTeachersList(){
        Teacher teacher = new Teacher("Цюцюра Микола Ігорович", 1,
                "Програмування", "АСОІУ", "Лаборант");
        teachersList.add(teacher);
        Teacher teacher2 = new Teacher("Проскура Світлана Леонідівна", 2,
                "Програмування", "АУТС", "Лаборант");
        teachersList.add(teacher2);
        Teacher teacher3 = new Teacher("Павлов Олександр Анатолійович", 1,
                "Теорія ймовірностей, мат. статистика", "АСОІУ", "Декан");
        teachersList.add(teacher3);
        Teacher teacher4 = new Teacher("Жук Віктор Андрійович", 1,
                "Математичний аналіз, ЛААГ", "АУТС", "Доцент");
        teachersList.add(teacher4);
        Teacher teacher5 = new Teacher("Жданова Олена Василівна", 2,
                "Дослідження операцій, мат. статистика", "АСОІУ", "Доцент");
        teachersList.add(teacher5);
        Teacher teacher6 = new Teacher("Шевченко Ольга Миколаївна", 2,
                "Англійська мова", "ІВТ", "Доцент");
        teachersList.add(teacher6);
        Teacher teacher7 = new Teacher("Гриша Олена Василівна", 2,
                "Системний аналіз", "АСОІУ", "Доцент");
        teachersList.add(teacher7);

    }
    public static void createTeacher(){
        System.out.println("Уведіть повне ім'я викладача (ПІБ):");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Виберіть стать викладача:\n 1.Чоловіча\n 2.Жіноча");
        int gender = scanner.nextInt();

        System.out.println("Вкажіть через кому дисципліни, які читає викладач: ");
        String tempDisciplines = scanner.nextLine();
        String disciplines = scanner.nextLine();

        System.out.println("Вкажіть кафедру викладача: ");
        String department = scanner.nextLine();

        System.out.println("Вкажіть посаду викладача: ");
        String position = scanner.nextLine();

        Teacher teacher = new Teacher(name, gender, disciplines, department, position);
        teachersList.add(teacher);

    }
}
