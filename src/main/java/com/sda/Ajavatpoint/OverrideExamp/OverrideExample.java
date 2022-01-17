package com.sda.Ajavatpoint.OverrideExamp;

//parinte
class TestClass {

        void method(int a) {
            System.out.println("Base class method called with integer a = "+a);
        }

        void method(double d) {
            System.out.println("Base class method called with double d ="+d);
        }
    }

    //copil
    class Derived extends TestClass {
        @Override
        void method(int a) {
            System.out.println("TestClass  method called with integer a = "+a);
        }

        @Override
        void method(double d) {
            System.out.println("Derived class method called with double d ="+d);
        }
    }

    class Main {
        public static void main(String[] args) {
            new Derived().method(10.5);
            new Derived().method(1.5);
            new Derived().method(19);
            new TestClass().method(20);
        }
    }

