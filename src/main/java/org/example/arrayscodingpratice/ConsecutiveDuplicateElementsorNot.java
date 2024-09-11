package org.example.arrayscodingpratice;

import java.util.Scanner;

public class ConsecutiveDuplicateElementsorNot {

    public static boolean findConsecutiveElementsSameOrNot(int [] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("array elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean result = findConsecutiveElementsSameOrNot(arr);
        System.out.println(result);

    }
}
