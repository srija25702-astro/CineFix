package com.srija.cinefix.data.dto;

public class Movie {
    private String movie_id;
    private String movie_name;
    private String genre;
    private String duration;

    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }

    private int screen_no;
    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}
