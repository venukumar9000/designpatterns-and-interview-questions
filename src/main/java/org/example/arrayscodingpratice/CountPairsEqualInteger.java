package org.example.arrayscodingpratice;

import java.util.Scanner;

public class CountPairsEqualInteger {

    public static int findCountPairs(int [] arr,int b){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==b){
                count++;
            }

        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("give me sum value");
        int b = sc.nextInt();
//        findCountPairs(arr,b);
        System.out.println("count :"+findCountPairs(arr,b));

    }
}
