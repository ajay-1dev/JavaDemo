package oops.inheritance;

import java.sql.SQLOutput;

public class User {
    private String username; //private means this is accesable for this class User only
    private String email;//and if that need to get access for subclass then modify private to protected

    public User(String username,String email){
        this.username = username;
        this.email = email;
    }
    public void login(){
        System.out.println(username+" Logged in with "+email);
    }
    void ShowDashboard(){
        System.out.println("Dashboard of user"+username);
    }
    String getUsername(){
        return username;
    }
}
