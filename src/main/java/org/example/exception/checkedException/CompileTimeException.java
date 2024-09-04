package org.example.exception.checkedException;

import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
    public static void main(String[] args) {

        try{
           FileReader fileReader = new FileReader("tevdtd.txt");
           int data= fileReader.read();
           while (data != -1){
               System.out.println((char) data);
               fileReader.read();
           }
           fileReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
