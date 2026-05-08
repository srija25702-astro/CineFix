package com.srija.cinefix.data.dto;

public class Theater {
    private String theater_id;
    private String theater_name;
    private String location;
    private String movie_id;
    private int screen_no;

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }



    public String getTheater_name() {
        return theater_name;
    }

    public void setTheater_name(String theater_name) {
        this.theater_name = theater_name;
    }


    public String getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(String theater_id) {
        this.theater_id = theater_id;
    }


}
