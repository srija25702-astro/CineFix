package com.srija.cinefix.data.dto;

public class Screen {
    private int screen_no;
    private String theater_id;
    private String show_id;
    private String movie_id;

    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }



    public String getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(String theater_id) {
        this.theater_id = theater_id;
    }


    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }


    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }


}
