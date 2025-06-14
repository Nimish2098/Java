package com.spring.coupling.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[]args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");
        UserDataProvider userDB = new UserDataBaseProvider();
        // UserManager userManagerwithDB = new UserManager(userDB);

        UserManager userManagerwithDB =  (UserManager) context.getBean("UserManagerwithDataProvider");
        System.out.println(userManagerwithDB.getUserInfo());

        WebServiceProvider userWS = new WebServiceProvider();
        // UserManager userManagerwithWS = new UserManager(userWS);
        UserManager userManagerwithWS = (UserManager) context.getBean("UserManagerwithWebServiceProvider");
        System.out.println(userManagerwithWS.getUserInfo());
    }
}
