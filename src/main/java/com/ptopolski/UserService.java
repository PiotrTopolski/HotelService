package com.ptopolski;

import java.util.ArrayList;
import java.util.List;

public class UserService {

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
    public Room bookRoom(int roomNumber){
        if (hotel.roomsList.get(roomNumber - 1).isAvailable()){
            hotel.roomsList.get(roomNumber - 1).setAvailable(false);
        }
        return hotel.roomsList.get(roomNumber - 1);
    }
    public Room freeTheRoom(int roomNumber){
        if (!(hotel.roomsList.get(roomNumber - 1).isAvailable())){
            hotel.roomsList.get(roomNumber - 1).setAvailable(true);
        }
        return hotel.roomsList.get(roomNumber - 1);
    }
}
