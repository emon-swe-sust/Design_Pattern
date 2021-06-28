package com.company;

public class TextField implements Widget{
    private int width, height;

    public TextField(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println("TextField " + width + " , " + height);
    }
}
