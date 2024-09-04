package org.example.abstration;

public class AbstractMain {
    public static void main(String[] args) {
        Shape shape = new Circle();
       Shape shape2= new Rectangle();
        shape.draw();
        shape2.draw();
    }
}
