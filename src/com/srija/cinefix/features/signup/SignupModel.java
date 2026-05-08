package com.srija.cinefix.features.signup;

public class SignupModel {
    public boolean validateUserName(String user){
      if(user == null || user.length()<8){
          System.out.println("Enter username with 8 characters........");
          return false;
      }
      return true;
    }

    public boolean validatePassword(String password,String confirmPassword){
        if(password == null || password.length()<8){
            System.out.println("Enter username with 8 characters........");
            return false;
        }
        else if(!password.equals(confirmPassword)) {
            System.out.println("Please confirm the password correctly........");
            return false;
        }
        return true;
    }

}
