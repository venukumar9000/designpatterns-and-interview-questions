package org.example.strings;

import java.util.Scanner;

public class StringCharandIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String input =sc.nextLine();
        System.out.println(characterWithIndexes(input));

    }
    public static String characterWithIndexes(String name){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<name.length();i++){
          char c=  name.charAt(i);

          int index = (c-'a') +1;
            sb.append(c).append(index);
        }
        return sb.toString();
    }
}
