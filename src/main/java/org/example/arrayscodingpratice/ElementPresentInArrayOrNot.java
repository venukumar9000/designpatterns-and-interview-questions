package org.example.arrayscodingpratice;

import java.util.Scanner;

public class ElementPresentInArrayOrNot {

    public static boolean findElementPresent(int [] arr, int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("given element is: "+findElementPresent(arr,k));
    }
}
