package projectlaundry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author asus
 */
public class User_login extends abstract_login implements interface_login{
    private static String username,password;
    
    public User_login (String username,String password){
    this.username=username;
    this.password=password;
    
    }
    
    public static String getUsername(){
        return username;
    
    }
    public static String getPassword(){
        return password;
    }
    
    
    
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
        
    }
    
    
}
