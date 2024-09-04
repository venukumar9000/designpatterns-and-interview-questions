package org.example.exception.customException;

public class CustomException extends Exception{

    public CustomException(String message){
        super(message);;
    }
}

class Mian{
    public static void main(String[] args) {
        try {
            throw new CustomException("this is my custion exption");
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}