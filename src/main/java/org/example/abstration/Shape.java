package org.example.abstration;

abstract public class Shape {

    abstract  public  void draw();
}
class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
