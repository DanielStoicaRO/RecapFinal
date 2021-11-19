package com.sda.dsSDA.jDecorator;

public abstract class ShapeDecorator implements ShapeInterface{

    ShapeInterface decoratedShape;

    public ShapeDecorator(ShapeInterface decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
