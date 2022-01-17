package com.sda.Ajavatpoint.Example1;

//parent
public class Example1 {

    public void baseMethod() {
        System.out.println("Example1 called ...");
    }
}

//child
class Derived extends Example1 {

    public void baseMethod() {
        System.out.println("Example1 CHILD method called ...");
    }
}

class Test {
    public static void main(String args[]) {

        Example1 example1 = new Derived();
        example1.baseMethod();

        Derived derived = new Derived();
        derived.baseMethod();

        Example1 example11 = new Example1();
        example11.baseMethod();
    }
}

