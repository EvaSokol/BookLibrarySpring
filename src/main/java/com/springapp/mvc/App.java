package com.springapp.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Eva Sokolyanskaya on 25/10/2015.
 * My first Spring app.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        Library obj = (Library) context.getBean("libraryBean");
        obj.printHello();
    }
}
