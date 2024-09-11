package org.example.arrayscodingpratice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


class TesterMain{

    public static int[] findFrequency(int[] arr){
        int [] ans = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int [] ans = new int[n];
      ans=  findFrequency(arr);
      for (int i:ans){
          System.out.println(i);
      }

    }
}
