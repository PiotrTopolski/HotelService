package com.ptopolski;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private int numberOfBedRoom;
    private boolean hasBathroom;
    private boolean isAvailable;
    private List<Guest> guestList;

    Room(int roomNumber, int numberOfBedRoom, boolean hasBathroom, boolean isAvailable, List<Guest> guestList) {
        this.roomNumber = roomNumber;
        this.numberOfBedRoom = numberOfBedRoom;
        this.hasBathroom = hasBathroom;
        this.isAvailable = isAvailable;
        this.guestList = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBedRoom() {
        return numberOfBedRoom;
    }

    public void setNumberOfBedRoom(int numberOfBedRoom) {
        this.numberOfBedRoom = numberOfBedRoom;
    }

    public boolean isHasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "Room  {" +
                ",  Room Number = " + roomNumber +
                ",  Number Of Bed Room = " + numberOfBedRoom +
                ",  Has Bathroom = " + hasBathroom +
                ",  Is Available = " + isAvailable +
                ",  Guest List = " + guestList +
                '}'+"\n";
    }
}
