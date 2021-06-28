package com.company;

abstract class Decorator implements Widget{
    private Widget widget;

    public Decorator(Widget widget){
        this.widget = widget;
    }

    public void draw(){
        System.out.println("Fuck");
        widget.draw();
        System.out.println("Fuck");
    }
}
