package com.spring.coupling.tight;

public class TightCouplingExample {
    public static void main(String[]args){
        UserManager user = new UserManager();
        System.out.println(user.getUserInfo());
    }
}   
