package org.example.exception.unchecked;

public class RuntimeException {

    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
