package com.sda.recapFinalExercises.CompositionAggregation;

public class Bikes extends Vehicle{

   public void bikeHasWheels(){

       Wheels wheels = new Wheels();
       System.out.println("Bike  HAS - A Wheel   ");
       wheels.runningWheels();
       wheels.stoppingWheels();
   }
}
