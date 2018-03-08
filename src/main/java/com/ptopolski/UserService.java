package com.ptopolski;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    private Scanner scanner = new Scanner(System.in);
    private Hotel hotel = new Hotel();

    public List<Room> getListOfAllRooms() {
        return hotel.roomsList;
    }

    public List<Room> getListOfIsAvailableRooms() {
        List<Room> listOfAvailableRooms = new ArrayList<Room>();
        for (Room room : hotel.roomsList) {
            if (room.isAvailable()) {
                listOfAvailableRooms.add(room);
            }
        }
        return listOfAvailableRooms;
    }
    public boolean bookRoom(int roomNumber, int numberOfGuest){
        List<Guest> guestList = new ArrayList<>();
        for (int i = 0; i < numberOfGuest; i++){
            Guest guest = new Guest();
            guest.setFirstName(scanner.nextLine());
            guest.setSurname(scanner.nextLine());
            guest.setBirthDate(scanner.nextLine());
            guestList.add(guest);
        }
        selectRoomByRoomNumber(roomNumber).setGuestList(guestList);
        if (selectRoomByRoomNumber(roomNumber).isAvailable()){
            selectRoomByRoomNumber(roomNumber).setAvailable(false);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkOut(int roomNumber){
        if (!selectRoomByRoomNumber(roomNumber).isAvailable()){
            selectRoomByRoomNumber(roomNumber).setAvailable(true);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean getAvailableRoom(int roomNumber) {
        if (!selectRoomByRoomNumber(roomNumber).isAvailable()){
            return true;
        }
        else {
            return false;
        }
    }
    private Room selectRoomByRoomNumber(int roomNumber){
        for (Room room : getListOfAllRooms()){
            if (room.getRoomNumber() == roomNumber){
                return room;
            }
        }
        return null;
    }
}
