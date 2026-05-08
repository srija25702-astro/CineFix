package com.srija.cinefix.features.signin;

import com.srija.cinefix.data.dto.LoginRequest;

import java.util.Scanner;

public class SigninView {
    Scanner sc = new Scanner(System.in);
    public String init(){
        SigninModel model = new SigninModel();
        String result="";
        while(true){
            System.out.println("----------Sign in----------");
            System.out.println("Enter your username: ");
            String user = sc.nextLine();
            System.out.println("Enter your email: ");
            String email = sc.nextLine();
            System.out.println("Enter your password : ");
            String password = sc.nextLine();

            LoginRequest request = new LoginRequest(user,email,password);


            result=model.signIn(request);
            System.out.println(result);
            if(result.equals("customer")){
                System.out.println("Login successfull..........");
                break;
            }
            else if(result.equals("supervisor")){
                System.out.println("Login successfull Admin..........");
                break;
            }
            else if(result.equals("notUser")){
                System.out.println("Invalid creditials.........Try Again......");

            }
        }
        return result;

    }

}
