package com.ptopolski;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public List<Room> getListOfAllRooms(){
        Hotel rList = new Hotel();
        return rList.roomsList;
    }
    public List<Room> getListOfIsAvailableRooms(){
        List<Room> roomAvailableList = new ArrayList<Room>();
        Hotel rList = new Hotel();
        for (int i = 0; i < rList.roomsList.size(); i++){
            if (rList.roomsList.get(i).isAvailable()){
                roomAvailableList.add(rList.roomsList.get(i));
            }
        }
        return roomAvailableList;
    }
}
