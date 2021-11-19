package com.sda.dsSDA.jDecorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(ShapeInterface decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(ShapeInterface decoratedShape){
        System.out.println("Border color RED");
    }
}
