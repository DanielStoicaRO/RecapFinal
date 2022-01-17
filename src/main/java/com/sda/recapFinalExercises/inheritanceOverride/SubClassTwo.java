package com.sda.recapFinalExercises.inheritanceOverride;

public class SubClassTwo extends ParentClass {

    @Override
    public void displayMethod(String message) {
        super.displayMethod("The message from SubClassTWO is: " + message);
    }
}
