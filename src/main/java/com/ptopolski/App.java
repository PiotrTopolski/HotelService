package com.ptopolski;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService uService = new UserService();
        Scanner scanner = new Scanner(System.in);
        int roomNumber;
        char choice;
        while (true) {
            System.out.println("----------  HOTEL SERVICE MENU  ----------");
            System.out.println("-----  1. WYŚWIETL WSZYSTKIE POKOJE HOTELOWE  -----");
            System.out.println("-----  2. WYŚWIETL WSZYSTKIE DOSTĘPNE POKOJE  -----");
            System.out.println("-----  3. ZAMELDUJ SIE W HOTELU  -----");
            System.out.println("-----  4. WYMELDUJ SIE Z HOTELU  -----");
            System.out.println("-----  0. EXIT  -----");
            System.out.println("---------------------------------------------------");
            System.out.print("-----  :");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1': {
                    uService.getListOfAllRooms();
                    System.out.println(uService.getListOfAllRooms());
                    break;
                }
                case '2': {
                    uService.getListOfIsAvailableRooms();
                    System.out.println(uService.getListOfIsAvailableRooms());
                    break;
                }
                case '3': {
                    System.out.print("-----  Podaj nr. wybranego pokoju:  ");
                    roomNumber = scanner.nextInt();
                    uService.bookRoom(roomNumber);
                    if (uService.bookRoom(roomNumber)) {
                        System.out.println("-----  Ten pokuj jest zajęty!  -----");
                    }
                    break;
                }
                case '4': {
                    System.out.print("-----  Podaj nr. pokoju:  ");
                    roomNumber = scanner.nextInt();
                    uService.checkOut(roomNumber);
                    if (uService.checkOut(roomNumber)) {
                        System.out.println("-----  To nie jest twój pokuj!  -----");
                    }
                    break;
                }
                case '0': {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("-----  NIE MA TAKIEJ OPCJI  -----");
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
