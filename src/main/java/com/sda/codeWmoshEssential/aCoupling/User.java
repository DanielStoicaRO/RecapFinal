package com.sda.codeWmoshEssential.aCoupling;

public class User {
    //    Fields
    public String name;
    //constructor
    public User(String name, int age) {
        this.name = name;
    }
    //    Methods
    public void sayHello() {
        System.out.println("Hi my name is " + name);
    }


}
