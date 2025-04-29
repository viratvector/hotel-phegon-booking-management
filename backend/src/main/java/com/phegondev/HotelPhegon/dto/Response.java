package com.phegondev.HotelPhegon.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;

    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;
    private BookingDTO booking;
    private List<UserDTO> userList;
    private List<RoomDTO> roomList;
    private List<BookingDTO> bookingList;

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) { this.bookingConfirmationCode = bookingConfirmationCode; }

    public void setUser(UserDTO user) { this.user = user; }

    public void setBooking(BookingDTO booking) {
        this.booking = booking;
    }

    public void setBookingList(List<BookingDTO> bookingList) { this.bookingList = bookingList; }

    public int getStatusCode() { return statusCode; }

    public String getMessage() {
        return message;
    }

    public String getToken() {
        return token;
    }

    public String getRole() {
        return role;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public String getBookingConfirmationCode() {
        return bookingConfirmationCode;
    }

    public UserDTO getUser() {
        return user;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    public BookingDTO getBooking() {
        return booking;
    }

    public List<UserDTO> getUserList() {
        return userList;
    }

    public List<RoomDTO> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomDTO> roomList) {
        this.roomList = roomList;
    }

    public List<BookingDTO> getBookingList() {
        return bookingList;
    }
}
