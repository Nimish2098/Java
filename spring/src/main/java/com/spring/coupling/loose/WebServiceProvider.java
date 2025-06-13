package com.spring.coupling.loose;

public class WebServiceProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User Details from WebService";
    }
}
