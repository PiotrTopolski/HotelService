package com.ptopolski;
/*
3. Metodę rezerwacji zmodyfikuj tak aby móc przekazać nr pokoju oraz gości którzy się w nim
meldują. Zanim zameldujesz gości sprawdź czy przynajmniej 1 osoba jest pełnoletnia. Jeśli
wszystko działa bez problemów, wykonaj merge swojej gałęzi do developa.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService uService = new UserService();
        Scanner scanner = new Scanner(System.in);
        int roomNumber;
        int guestNumber;
        char choice;
        char selection;
        while (true) {
            System.out.println("--------------------------");
            System.out.println("---  Wyświetlic Menu?  ---");
            System.out.println("--------------------------");
            System.out.println("---  1. TAK  -------------");
            System.out.println("---  2. NIE  -------------");
            System.out.println("--------------------------");
            System.out.print("--- : ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1' :{
                    System.out.println("---------------------------------------------------");
                    System.out.println("--------------  HOTEL SERVICE MENU  ---------------");
                    System.out.println("---------------------------------------------------");
                    System.out.println("-----  1. WYŚWIETL WSZYSTKIE POKOJE HOTELOWE  -----");
                    System.out.println("-----  2. WYŚWIETL WSZYSTKIE DOSTĘPNE POKOJE  -----");
                    System.out.println("-----  3. ZAMELDUJ SIE W HOTELU  ------------------");
                    System.out.println("-----  4. WYMELDUJ SIE Z HOTELU  ------------------");
                    System.out.println("-----  0. EXIT  -----------------------------------");
                    System.out.println("---------------------------------------------------");
                    System.out.print("----- : ");
                    selection = scanner.next().charAt(0);
                    switch (selection) {
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
                            System.out.println("---------------------------------------------------");
                            System.out.print("-----  Podaj nr. wybranego pokoju:  ");
                            roomNumber = scanner.nextInt();
                            if (roomNumber > uService.getListOfAllRooms().size()) {
                                System.out.println("---------------------------------------------------");
                                System.out.println("--------  TEN POKUJ NIE ISTNIEJE !!!  -------------");
                                System.out.println("---------------------------------------------------");
                                break;
                            }
                            System.out.print("-----  Podaj ilość gości:  ");
                            guestNumber = scanner.nextInt();
                            System.out.println("-----  Podaj dane:  ");
                            System.out.println("-----  Imię / Nazwisko / Date urodzenia: ");

                            if (uService.getAvailableRoom(roomNumber)) {
                                System.out.println("---------------------------------------------------");
                                System.out.println("----------  TEN POKUJ JEST ZAJĘTY !!!  ------------");
                                System.out.println("---------------------------------------------------");
                            }
                            else {
                                if (roomNumber > 10){
                                    uService.bookRoom(roomNumber,guestNumber);
                                    System.out.println("---------------------------------------------------");
                                    System.out.println("-----  Zameldowałeś się w pokoju nr " + roomNumber + "!  ----------");
                                    System.out.println("---------------------------------------------------");
                                }
                                else {
                                    uService.bookRoom(roomNumber,guestNumber);
                                    System.out.println("---------------------------------------------------");
                                    System.out.println("-----  Zameldowałeś się w pokoju nr " + roomNumber + "!  -----------");
                                    System.out.println("---------------------------------------------------");
                                }

                            }
                            break;
                        }
                        case '4': {
                            System.out.println("---------------------------------------------------");
                            System.out.print("-----  Podaj nr. pokoju:  ");
                            roomNumber = scanner.nextInt();
                            if (!uService.getAvailableRoom(roomNumber)) {
                                System.out.println("---------------------------------------------------");
                                System.out.println("----------  TO NIE JEST TWÓJ POKUJ !!!  -----------");
                                System.out.println("---------------------------------------------------");
                            }
                            else {
                                if (roomNumber > 10){
                                    uService.checkOut(roomNumber);
                                    System.out.println("---------------------------------------------------");
                                    System.out.println("-----  Wymeldowałeś się z pokoju nr " + roomNumber + "!  ----------");
                                    System.out.println("---------------------------------------------------");
                                }
                                else {
                                    uService.checkOut(roomNumber);
                                    System.out.println("---------------------------------------------------");
                                    System.out.println("-----  Wymeldowałeś się z pokoju nr " + roomNumber + "!  -----------");
                                    System.out.println("---------------------------------------------------");
                                }

                            }
                            break;
                        }
                        case '0': {
                            System.exit(0);
                            break;
                        }
                        default: {
                            System.out.println("---------------------------------------------------");
                            System.out.println("--------------  NIE MA TAKIEJ OPCJI !!! -----------");
                            System.out.println("---------------------------------------------------");
                            break;
                        }
                    }
                    break;
                }
                case '2' :{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("---------------------------------------------------");
                    System.out.println("--------------  NIE MA TAKIEJ OPCJI !!! -----------");
                    System.out.println("---------------------------------------------------");
                    break;
                }

            }
        }
    }
}
