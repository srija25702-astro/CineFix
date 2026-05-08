package com.srija.cinefix.features.signup;

import com.srija.cinefix.data.dto.Viewer;
import com.srija.cinefix.data.repository.CinefixDb;

import java.util.Scanner;

public class SignupView {
     Scanner sc = new Scanner(System.in);
     public void create(){
         SignupModel s = new SignupModel();
         while(true){
             System.out.println("Enter your username: ");
             String user = sc.nextLine();
             System.out.println("Enter your email: ");
             String email = sc.nextLine();
             System.out.println("Enter your password: ");
             String  password = sc.nextLine();
             System.out.println("Please confirm  your password: ");
             String  confirmPassword = sc.nextLine();
             boolean usercheck = s.validateUserName(user);
             boolean passwordcheck = s.validatePassword(password,confirmPassword);
             if(usercheck && passwordcheck){
                 Viewer v = new Viewer(user,email,password);
                 CinefixDb db = new CinefixDb();
                 boolean exist = db.isExist(v);
                 if(exist){
                     CinefixDb.viewers.add(v);
                     break;
                 }
                 else{
                     System.out.println("Account alreadyexist.........");
                 }
             }
         }
     }
}
