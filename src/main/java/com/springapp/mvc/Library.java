package com.springapp.mvc;

/**
 * Created by Eva Sokolyanskaya on 25/10/2015.
 * My first Spring class
 */
public class Library {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello! " + name);
    }
}
