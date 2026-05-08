package com.srija.cinefix.data.dto;

public class Viewer extends User{
    private static int idGenerator=1;
    private int user_id;


    public Viewer(String user_name,String email,String password){
        super(user_name, email,password);
        this.user_id = idGenerator++;

    }

    public int  getUser_id() {return user_id;}





}
