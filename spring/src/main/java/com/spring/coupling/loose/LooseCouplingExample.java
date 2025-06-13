package com.spring.coupling.loose;

public class LooseCouplingExample {
    public static void main(String[]args){
        UserDataProvider userDB = new UserDataBaseProvider();
        UserManager userManagerwithDB = new UserManager(userDB);
        System.out.println(userManagerwithDB.getUserInfo());

        WebServiceProvider userWS = new WebServiceProvider();
        UserManager userManagerwithWS = new UserManager(userWS);
        System.out.println(userManagerwithWS.getUserInfo());
    }
}
