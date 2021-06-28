package com.company;

public class DecoratorDemo {

    public static void main(String[] args) {
	// write your code here
//        Widget widget = new BorderDecorator(new TextField(80, 23));
//        widget.draw();
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(
                new TextField(80, 23))));
        widget.draw();
//
//        widget = new BorderDecorator(new ScrollDecorator(new ScrollDecorator(
//                new TextField(80, 23))));
//        widget.draw();
//
//        widget = new ScrollDecorator(new ScrollDecorator(new BorderDecorator(
//                new TextField(80, 23))));
//        widget.draw();
    }
}
