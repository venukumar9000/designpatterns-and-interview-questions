package org.example.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayListExample2.test();
        twoDArrayList.twoDArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements for array");
        int n =sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        System.out.println("enter elements");
        for (int i=0;i<n;i++){
            input.add(sc.nextInt());
        }

       ArrayList<Integer>result = MutiplesOf5and7.getMultiplesof5And7(input);
        System.out.println("multiple by 5 and 7 :"+result);

        System.out.println("Elemet of A and B");
        int a = sc.nextInt();
        int b= sc.nextInt();
        ArrayList<Integer> res=MultiplesOfAanB.getmutiplesb(a,b);
        System.out.println(res+"-----------");
    }
}
class MutiplesOf5and7{
    public static ArrayList<Integer> getMultiplesof5And7(ArrayList<Integer> arr){
        ArrayList<Integer> res = new ArrayList();

        for(int i=0;i< arr.size();i++){
            if(arr.get(i)%5==0 || arr.get(i)%7==0){
                res.add(arr.get(i));
            }
        }
        return res;

    }

}
/*

input a=2 b=4
o/p:[2,4,6,8]
 first 4 multiples of 2
 */
class MultiplesOfAanB{
    public static ArrayList<Integer> getmutiplesb(int a,int b){
       ArrayList<Integer> li = new ArrayList<>();
       for(int i=1;i<=b;i++){
           li.add(a*i);
       }
       return li;
    }
}

class twoDArrayList{
    public static void twoDArrayList(){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.println(arr);
        ArrayList<Integer> row0= new ArrayList<>();
        row0.add(1);
        row0.add(4);
        arr.add(row0);
        System.out.println(arr);

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(3);
        row1.add(4);
        arr.add(row1);
        System.out.println(arr);
    }
}

/*
input:-
[[1,4],[0],[1,10,20]]
o/p:-
1 4
0
1 10 20
  */
class ArrayListExample2{
    public static void test(){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> row0= new ArrayList<>();
        row0.add(1);
        row0.add(4);
        arr.add(row0);
        ArrayList<Integer> row1= new ArrayList<>();
        row1.add(0);
        arr.add(row1);
        ArrayList<Integer> row2= new ArrayList<>();
        row2.add(1);
        row2.add(10);
        row2.add(20);
        arr.add(row2);
        System.out.println(arr+"  new array");
        for(int i=0;i< arr.size();i++){
          for(int n : arr.get(i)){
              System.out.print(n+" ");
          }
            System.out.println();
        }

    }
}
