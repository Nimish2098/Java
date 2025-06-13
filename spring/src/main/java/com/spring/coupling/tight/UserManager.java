package com.spring.coupling.tight;

public class UserManager {
    
    private final UserDataBase userDB = new UserDataBase();
    
    public String  getUserInfo(){
        return userDB.getUserDetails();
    }
}
