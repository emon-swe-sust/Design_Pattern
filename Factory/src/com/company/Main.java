package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory = new Factory();

        Shape Circle = factory.getShape("CIRCLE");
        Circle.draw();

        Shape rect = factory.getShape("RECTANGLE");
        rect.draw();
    }
}
