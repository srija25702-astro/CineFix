package com.srija.cinefix.data.repository;

import com.srija.cinefix.data.dto.Admin;
import com.srija.cinefix.data.dto.Theater;
import com.srija.cinefix.data.dto.Viewer;

import java.util.ArrayList;
import java.util.List;

public class CinefixDb {
    public static List<Viewer> viewers=new ArrayList<>();
    public static List<Theater> theaters= new ArrayList<>();
    public static Admin admin = new Admin("srija2572","srija@gmail.com","srija257@2");
    public boolean isExist(Viewer v){
        for(Viewer viewer : CinefixDb.viewers){
            if(viewer.getUserName().equals(v.getUserName()) && viewer.getPassword().equals(v.getPassword()) && viewer.getUserName().equals(admin.getUserName()) && viewer.getPassword().equals(admin.getPassword())){
                return false;
            }
        }
        return true;
    }



}
