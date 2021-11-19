package com.sda.recapFinalExercises.Liskov;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person();
//          LISKOV Principle: if change new Person() with new Student() the program MUST be functional !!!
//                Person person1 = new Student();

        person1.setAge(19);
        person1.setName("Maria");

        System.out.println("Name : " + person1.getName() + ", age: " + person1.getAge());

        System.out.println("===== Call 3 same Named method from Student =======");
        Student student = new Student();
        student.method();
        student.method("Mac Mac");
        student.method(11);


    }
}
