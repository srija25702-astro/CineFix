package com.srija.cinefix.data.dto;

public class Show {
    private String show_id;
    private String show_time;
    private String movie_id;
    private String theater_id;

    public String getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(String theater_id) {
        this.theater_id = theater_id;
    }



    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }



    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }



    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }
}
