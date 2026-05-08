package com.srija.cinefix.data.dto;

public class Seat {
    private String seat_no;
    private String theater_id;
    private boolean isBooked;
    private int screen_no;

    public String getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(String seat_no) {
        this.seat_no = seat_no;
    }


    public String getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(String theater_id) {
        this.theater_id = theater_id;
    }




    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }


}
