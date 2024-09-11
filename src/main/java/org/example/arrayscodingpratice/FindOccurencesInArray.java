package org.example.arrayscodingpratice;

import java.util.Scanner;

public class FindOccurencesInArray {

    public static int findFrequency(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter arry elements");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("select an element what u are searching for");
        int k = sc.nextInt();
        System.out.println("number of occurance: "+findFrequency(arr,k));

    }
}
