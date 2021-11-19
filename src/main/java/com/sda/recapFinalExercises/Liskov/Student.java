package com.sda.recapFinalExercises.Liskov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person{

    private boolean hasMoney;



    public void method(){
        System.out.println(" -nothing here");
    }

    public void method(String string){
        System.out.println(string + " -string here");
    }

    public void method(Integer number){
        System.out.println(number + " -number here");
    }


}
