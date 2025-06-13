package com.spring.coupling.loose;

public class UserDataBaseProvider implements UserDataProvider{
        @Override
        public String getUserDetails(){
            return "Details from DataBase";
        }

}
