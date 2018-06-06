package Interface;

import Entity.*;
import sun.tools.tree.NewArrayExpression;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main (String[] Arg) {
        int op ;
        boolean ban ;
        ArrayList<Item> listOfItems = new ArrayList<Item>();
        ArrayList<Order> listOfOrders = new ArrayList<Order> ();
        ArrayList<Payment> listOfPayments = new  ArrayList<Payment>();
        do {

            System.out.println("Menu");
            System.out.println("1.Register Item");
            System.out.println("2.List Items");
            System.out.println("3.Register Order");
            System.out.println("4.List Orders");
            System.out.println("5.Register Client");
            System.out.println("6.List Clients");
            System.out.println("7.Register Payment");
            System.out.println("8.List Payments");
            System.out.println("9.Exit");
            Scanner scanner = new Scanner(System.in);
            ban = false;

            op = Integer.parseInt(scanner.nextLine());
            switch (op) {

                case 1:
                    do {
                        System.out.println("Enter item Id: ");
                        String id = scanner.nextLine();
                        if (isNumber(id)) {
                            Item newItem = new Item(Integer.parseInt(id),"");
                            if (!(listOfItems.contains(newItem))) {
                                do {
                                    System.out.println("Enter item Name: ");
                                    String name = scanner.nextLine();
                                    if (name != null) {
                                        newItem.setName(name);
                                        listOfItems.add(newItem);
                                        ban = true;
                                    } else {
                                        System.out.println("Please enter a Name");
                                    }
                                }while (!ban);
                            }else {
                                System.out.println("Item Id Already in use");

                            }

                        }else {
                            System.out.println("Please Input A Valid Number");
                        }


                    }while(!ban);

                    break;
                case 2:
                    System.out.println("Existing Items: ");
                    for (Item i: listOfItems
                         ) {
                        System.out.println(i.toString());
                    }
                    break;
                case 3:
                    do {
                        System.out.println("Enter Order Id: ");
                        String id = scanner.nextLine();
                        if (isNumber(id)) {
                            Order newOrder = new Order(Integer.parseInt(id));
                            if (!(listOfOrders.contains(newOrder))) {
                                do {
                                    ArrayList<Item> orderItems= new ArrayList<Item>();
                                    System.out.println("Order Menu");
                                    System.out.println("1.Add Item");
                                    System.out.println("2.List Items");
                                    System.out.println("2.Confirm Order");
                                    System.out.println("3.Cancel Order");
                                    op = Integer.parseInt(scanner.nextLine());
                                    switch (op) {
                                        case 1 :
                                            System.out.println("Write item Id: ");
                                            String idItem = scanner.nextLine();
                                            if (isNumber(idItem)) {
                                                Item it = new Item (Integer.parseInt(idItem),"");
                                                if (listOfItems.contains(it)) {
                                                    if (!orderItems.contains(it)) {
                                                        orderItems.add(listOfItems.get(listOfItems.indexOf(it)));
                                                    } else {
                                                        System.out.println("The Item is already part of the order");
                                                    }
                                                }else {
                                                    System.out.println("Item does not exists");
                                                }
                                            } else {
                                                System.out.println("Please enter a number");
                                            }
                                            break;
                                        case 2 :
                                            System.out.println("Available Items: ");
                                            for (Item i: orderItems
                                                    ) {
                                                System.out.println(i.toString());
                                            }
                                            break;
                                        case 3 :
                                            if (orderItems.size() > 0) {
                                                newOrder.setItems(orderItems);
                                                listOfOrders.add(newOrder);
                                            }
                                            ban = true;
                                            break;
                                        case 4 :
                                            ban = true;
                                            break;
                                    }

                                }while ((op == 3) || (op == 4));
                            }else {
                                System.out.println("Order Id: "+id +" already exists");

                            }

                        }else {
                            System.out.println("Please input a valid number");
                        }


                    }while(!ban);


                    break;
                case 4:
                    System.out.println("Existing Orders: ");
                    for (Order i: listOfOrders
                            ) {
                        System.out.println(i.toString());
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;

            }
        }while (op != 9);
    }

    private static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;


    }

}
