package com.sda.recapVehicle;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Menu {

    private ClientManager clientManager = new ClientManager();
    private CarManager carManager = new CarManager();
    private Scanner scanner = new Scanner(System.in);

    public Menu() {
        showMainMenu();
    }

    private void showMainMenu() {
        int option;
        System.out.println("Welcome to Vehicle Menu: " +
                "\nPlease select your option: " +
                "\n1. Add new Client" +
                "\n2. Product List" +
                "\n3. BUY PRODUCT ... SubMenu" +
                "\n0. Exit");
        try {
            option = scanner.nextInt();
        } catch (MissingFormatArgumentException exception) {
            System.out.println(" Please introduce only numbers");
            option = scanner.nextInt();
        }
        System.out.println("Wanting for input: ");
        switch (option) {
            case 1:
                System.out.println("Introduce Person: ");
                clientManager.addClient();
                break;
            case 2:
                carManager.print();
//                bikeManager.print();
                break;
            case 3:
                showBuyMenu();
                break;
            default:
                System.out.println("Option is not valid!");
        }
        showMainMenu();
    }

    private void showBuyMenu() {
        System.out.println("Please Select: " +
                "\n 1. Client " +
                "\n 2. Car " +
                "\n 0. Exit to Main Menu  ");
        int option = scanner.nextInt();
        Person client;
        Car car;
//        Bike bike;

        while (option != 0) {
            switch (option) {
                case 1:
                    clientManager.printClients();
                    System.out.println("Please select client number: ");
                    int index = scanner.nextInt();
                    client = clientManager.getClient(index);
                    System.out.println("Client selected: " + index);
                    break;
                case 2:
                    System.out.println("Please select Car Number: ");
                    index = scanner.nextInt();
                    car = carManager.getCar(index);
                    System.out.println("Car selected: " + car);

                    carManager.removeCar(index);
                    carManager.print();
                    break;
                case 3:
                    System.out.println("Please select you BIKE");
                    break;
            }
            System.out.println("Select another option!");
            option = scanner.nextInt();
        }
        showMainMenu();
    }


}
