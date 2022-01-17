package com.sda.recapFinalExercises.inheritanceOverride;

public class SubClassOne extends ParentClass {

    @Override
    public void displayMethod(String message) {
        super.displayMethod("The message from SubClassONE is: " + message);
    }

    @Override
    public Integer displayMethod(Integer value){
    return value;
    }
}
