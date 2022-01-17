package com.sda.recapFinalExercises.miniApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Human {

    private String name;
    private String sex;
    private int age;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human() {
    }

    public void methodAge() {
        if (age < 18) {
            System.out.println("Children is minor");
        } else System.out.println("The Guy in adult");
    }

    public Human addHumansInList(Human human){
        List<Human> allHuman = new ArrayList<>();
        allHuman.add(human);
        System.out.println(allHuman);
        return human;
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Human setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
