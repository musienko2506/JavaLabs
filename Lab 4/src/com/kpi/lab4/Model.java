package com.kpi.lab4;
import java.util.ArrayList;
import java.util.Scanner;

import static com.kpi.lab4.SourceData.*;

public class Model {
   static Waiter waiter = new Waiter("");
    static Client client = new Client();
    static Admin admin = new Admin("");

//View view = new View();
public static void  seeMenu(){
    Dish.printMenu(menu);
}
    public static void createMenu(){

    }
    public static void seeFreeTables(){
        Table.printAllTables(tables);
    }
    public static int orderTable(String surname){
    int tableID=0;
        for (Table t:tables
             ) {
            if(t.isFree()) {tableID=t.getId();
            t.setOwner(surname);
            t.setFree(false);
            break;}
        }
        if(tableID>0)

           return tableID;
        else return 0;

    }
    public static Order takeOrder(Client client){

    client.getTableID().getId();
        seeMenu();
        System.out.println("Уведіть через пробіл номери страв, які бажаєте замовити: ");
        Scanner scanner = new Scanner(System.in);
        String strOrder = scanner.nextLine();
        String strArr[] = strOrder.split(" ");
        ArrayList<Integer> numArr = new ArrayList<>();
        ArrayList<Dish> tempDish = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            numArr.add(Integer.parseInt(strArr[i]));
            tempDish.add(menu.get(numArr.get(i)-1));

        }
        double sum = calculateSum(tempDish);
        System.out.println("Ваше замовлення прийнято!");

        Order order = new Order(client.getTableID(),tempDish, sum,true,false,false);
       // Order order = new Order(tables.get(tableID-1),tempDish, 0,true,false,false);
        orders.add(order);
        return order;
    }

    public static double calculateSum( ArrayList<Dish> tempDish){
    double sum = 0;
        for (int i = 0; i <tempDish.size(); i++) {
            sum+=menu.get(i).getCost();
        }

    return sum;
    }
    public static void doOrder(){
        for (Order o:orders
             ) {
            o.setDone(true);
            
        }
     //   System.out.println("Всі замовлення було виконано!");
    }
    public static void seeOrders(){
        for (Order o:orders
             ) {
            o.printOrder(o);
        }
    }
    public static void payOrder(int tableID){


        for (Order o:orders
             ) {
           if(o.getTableID().getId()==tableID)o.setPaid(true);
           // o.setPaid(true);
        }

 //ДОРОБИТИ!!!!


    }
    public static void freeUpTable(int tableID){
       // int tableID = client.getTableID().getId();
        int count = 0;
        for (Order o:orders
             ) {
            if(o.getTableID().getId()==tableID && !o.isPaid()){
                count++;
            }

        }
        if(count>0){
            System.out.println("ВИ НЕ РОЗРАХУВАЛИСЯ!!!");
            clientItem();
        }
        else    {tables.get(tableID-1).setFree(true);
            System.out.println("До побачення!");}

    }
    public static boolean isAlpha(String name) {
        return name.matches("[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ']+");
    }
    public static void addDish(){
        Scanner scanner = new Scanner(System.in);
        String name;
        int cost;
        int id;
        boolean named = false;
        boolean costed = false;


do{
    System.out.println("Уведіть назву страви: ");

    while(!scanner.hasNextLine()){
        System.out.println("Уведіть коректну назву!");
       scanner.next();
    }
    name = scanner.nextLine();
}
while(!isAlpha(name));







        do {
            System.out.println("Уведіть ціну страви:");
            while (!scanner.hasNextInt()) {
                System.out.println("!!! Це не число !!!");
                scanner.next(); // this is important!
            }
            cost = scanner.nextInt();
        } while (cost <= 0);



            if (menu.isEmpty()) id = 1;
            else id = menu.size() + 1;
            Dish newDish = new Dish(id, name, cost);
            menu.add(newDish);

    }
    public static void waiterItem(){

        System.out.println("\n\t*** Виберіть пункт меню:: ***\n 1. Прийняти замовлення. \n 2. Виконати замовлення." +
                "\n 3. Розрахувати замовлення\n 4. Головне меню\n 0. Вихід ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int key = scanner.nextInt();

            switch (key) {
                case 1:
                    waiter.takeOrder(client);
                    break;
                case 2:
                    waiter.doOrder();
                    break;
                case 3:
                    System.out.println("Всі рахунки було видано!");
                    break;

                case 4:
                    View.menu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t!!! Виберіть пункт меню !!!");
            }
        } else System.out.println("\t!!! Ви вели не число !!!");
    }
    public static void clientItem(){

        System.out.println("\n\t*** Виберіть пункт меню:: ***\n " +
                "1. Замовити столик. \n " +
                "2. Здійснити замовлення.\n " +
                "3. Стан мого замовлення.\n "+
                "4. Головне меню \n " +
                "0. Вихід ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int key = scanner.nextInt();

            switch (key) {
                case 1:
                    client.orderTable();
                    break;
                case 2:
                    client.makeOrder(client);
                    break;
                case 3:
                    client.statusOrder();
                    break;


                case 4:
                    View.menu();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t!!! Виберіть пункт меню !!!");
            }
        } else System.out.println("\t!!! Ви вели не число !!!");
    }
    public static void statusOrder(int numberTable){
    int count = 0;

        for (Order o:orders
             ) {
            if (o.getTableID().getId()==numberTable){
                o.printOrder(o);
                System.out.println("\n\t*** Виберіть пункт меню:: ***\n " +
                        "1. Розрахуватись. \n " +
                        "2. Звільнити столик. \n "+
                        "3. Головне меню.\n " );

                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    int key = scanner.nextInt();

                    switch (key) {
                        case 1:
                            client.payOrder(numberTable);
                            break;
                        case 2:
                           client.freeUpTable(numberTable);
                            break;
                        case 3:
                            View.menu();
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\t!!! Виберіть пункт меню !!!");
                    }
                } else System.out.println("\t!!! Ви вели не число !!!");

                count++;
            }

        }
        if(count==0)
            System.out.println("У вас немає замовлень.");
    }
    public static void adminItem(){
        System.out.println("\n\t*** Виберіть пункт меню:: ***\n 1. Прийняти замовлення столика. \n 2. Скласти меню.\n " +
                "3. Переглянути вільні столики \n 4. Переглянути меню ресторана \n 5. Головне меню \n 0. Вихід ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int key = scanner.nextInt();

            switch (key) {
                case 1:
                   admin.takeOrder(client);
                    break;
                case 2:
                    admin.createMenu();
                    break;
                case 3:
                    admin.seeFreeTables();
                    break;

                case 4:
                    Dish.printMenu(menu);
                    break;
                case 5:
                    View.menu();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t!!! Виберіть пункт меню !!!");
            }
        } else System.out.println("\t!!! Ви вели не число !!!");
    }
    public void createRestaurant() {
    Restaurant restaurant = new Restaurant();
    restaurant.createRestaurant();
    }



}
