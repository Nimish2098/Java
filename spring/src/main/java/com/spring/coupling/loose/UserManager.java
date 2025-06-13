package com.spring.coupling.loose;

public class UserManager {
    private UserDataProvider user = new UserDataBaseProvider();

    UserManager(UserDataProvider user){
        this.user =user;

    }
    public String getUserInfo(){
        return user.getUserDetails();
    }
}
