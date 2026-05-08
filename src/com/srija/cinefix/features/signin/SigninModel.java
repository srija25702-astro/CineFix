package com.srija.cinefix.features.signin;

import com.srija.cinefix.data.dto.LoginRequest;
import com.srija.cinefix.data.dto.Viewer;
import com.srija.cinefix.data.repository.CinefixDb;

import static com.srija.cinefix.data.repository.CinefixDb.admin;

public class SigninModel {
       public String signIn(LoginRequest request){
           for(Viewer viewer : CinefixDb.viewers){
               if(viewer.getUserName().equals(request.getUserName()) && viewer.getPassword().equals(request.getPassword())){
                   return "customer";
               }
           }
           if(request.getUserName().equals(admin.getUserName())&& request.getPassword().equals(admin.getPassword())){
               return admin.getRole();
           }
           return "notUser";
       }
}
