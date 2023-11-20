package Controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthenticationController {
//    signUp();
//    login();
//    guest();
//    forgotPassword();
//    OTP();

    private  Map<String, String > userCredentials;
    private  Map<String, String > passwordResetRequests;
    private String guestUsername;

    public  AuthenticationController(){
        this.userCredentials = new HashMap<>();
        this.passwordResetRequests = new HashMap<>();
        this.guestUsername = "guest";
    }

    public  void signUp(String  username, String  password){
        if(!userCredentials.containsKey(username)){
            userCredentials.put(username,password);
            System.out.println("Sign-up successful for user: "+ username);
        }
        else{
            System.out.println("Username already exists. Please choose a different username ");
        }
    }

    public  void login(String username, String password){
        if(userCredentials.containsKey(username) && userCredentials.get(username).equals(password)){
            System.out.println("Login Successful. Welcome, "+ username + "!");
        }else{
            System.out.println("Invalid username or password. Please try again ");
        }
    }

    public void forgotPassword(String username){
        if (userCredentials.containsKey(username)){
           String newPassword = generateRandomPassword();
            userCredentials.put(username,newPassword);
            passwordResetRequests.remove(username); // remove any previous reset req
            System.out.println("Password reset successful. Your new password is: "+ newPassword);
        }else{
            System.out.println("Username not found. Please enter a valid username.");

        }


    }

    public void guestLogin(){
        System.out.println("Guest login successful. Welcome Guest!");
    }

    private  String generateRandomPassword(){
        //Simplified method to generate a random password for password reset
        return  "NewPassword123";
    }

}
