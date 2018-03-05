package com.ptopolski;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp(){
        userService = new UserService();
    }

    @Test
    public void whenInduceGetListOfAllRoomsThenGetListOfAllRooms(){
        assertThat(userService.getListOfAllRooms()).isEqualTo(userService.getListOfAllRooms());
    }
    @Test
    public void whenInduceGetListOfAllRoomsIsNoRoomThenNotGetListOfAllRooms(){
        Room result = userService.getListOfAllRooms().get(0);
        assertThat(result).isEqualTo(userService.getListOfAllRooms().get(0));
    }
    @Test
    public void whenInduceGetListOfIsAvailableRoomsThenGetListOfAvaliableRooms(){
        List<Room> result = userService.getListOfIsAvailableRooms();
        assertThat(result).isEqualTo(userService.getListOfAllRooms());
    }
    @Test
    public void whenBookRoomThenBookRoom(){
        boolean result = userService.bookRoom(3);
        assertThat(result).isEqualTo(true);
    }
    @Test
    public void whenBookRoomThenRoomGetRoomNumberIsAvailableReturnFalse(){
        userService.bookRoom(1);
        assertThat(userService.getListOfAllRooms().get(0).isAvailable()).isEqualTo(false);
    }
    @Test
    public void whenBookRoomThenListOfAllRoomsMinusBookRoomIsEqualsListOfAvailableRoom(){
        userService.bookRoom(1);
        List<Room> testRoomList = userService.getListOfAllRooms();
        testRoomList.remove(0);
        assertThat(testRoomList).isEqualTo(userService.getListOfIsAvailableRooms());
    }
    @Test
    public void whenCheckOutThenCheckOut(){
        boolean result = userService.checkOut(3);
        assertThat(result).isEqualTo(true);
    }
}
