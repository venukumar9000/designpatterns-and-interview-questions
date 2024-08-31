package org.example.polymorphism;

import javax.swing.*;

public class Animal {

    public void sound(){
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("dog barks");
    }
}
class  Lion extends Animal{

    @Override
    public void sound(){
        System.out.println("lion roars");
    }
}

class MainAnimal{
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1= new Lion();

        animal.sound();
        animal1.sound();
    }
}
