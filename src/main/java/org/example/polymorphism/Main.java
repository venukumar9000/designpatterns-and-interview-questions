package org.example.polymorphism;

 class MathAddtion {

    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b,int c){
        return a+b+c;
    }
}
public class  Main{
    public static void main(String[] args) {
        MathAddtion mathAddtion = new MathAddtion();
        System.out.println(  mathAddtion.add(11,1));
        System.out.println( mathAddtion.add(1,2,3));
    }
}

