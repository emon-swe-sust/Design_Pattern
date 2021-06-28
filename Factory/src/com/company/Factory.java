package com.company;

public class Factory {
    public Shape getShape(String shapeType){
        if (shapeType == null)
            return null;
        if(shapeType == "CIRCLE")
            return new Circle();
        else if (shapeType == "SQUARE")
            return new Square();
        else if (shapeType == "RECTANGLE")
            return new Rectangle();
        else return null;
    }
}
