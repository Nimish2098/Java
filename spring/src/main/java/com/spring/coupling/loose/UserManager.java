package com.spring.coupling.loose;

public class UserManager {
    private UserDataProvider user = new UserDataBaseProvider();

    @Override
    public String toString() {
        return "UserManager [user=" + user + "]";
    }
    UserManager(UserDataProvider user){
        this.user =user;

    }
    public String getUserInfo(){
        return user.getUserDetails();
    }
}
