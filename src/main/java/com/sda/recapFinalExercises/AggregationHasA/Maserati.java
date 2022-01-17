package com.sda.recapFinalExercises.AggregationHasA;
// Class2
// Child class
// Helper class

//IS A =>
public class Maserati extends Car{
    public Maserati(String color, int maxSpeed, String brand) {
        super(color, maxSpeed, brand);
    }

    // Method in which it is shown
    // what happened with the engine of Puslar

    public void MaseratiStartDemo() {
        // Creating an object of Engine type
        // using stop() method
        // Here, engine is name of an object
        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }


}


