package com.sda.dsSDA.jDecorator;

public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(ShapeInterface decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBlueBackground(decoratedShape);
    }

    private void setBlueBackground(ShapeInterface decoratedShape){
        System.out.println("Background color Blue");
    }
}
