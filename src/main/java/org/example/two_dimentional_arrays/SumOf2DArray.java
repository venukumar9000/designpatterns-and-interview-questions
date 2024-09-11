package org.example.two_dimentional_arrays;

import java.util.Scanner;

public class SumOf2DArray {
    public static int findsum(int [] [] mat){
        int m =mat.length;
        int n =mat[0].length;
        int sum=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                sum+=mat[r][c];
            }
        }
       return sum;
    }
}

  /*
   input: 4*4
    1 2 3 4
    5 6 7 8
    9 1 2 0
    3 4 5 6

    output:
    1 2 3 4
    8 7 6 5
    9 1 2 0
    6 5 4 3

    */

class LeftToRight{
    public static void evencolRevereseOrder(int [][] mat){
        int m= mat.length;
        int n=mat[0].length;
        for(int r=0;r<m;r++){
          if(r%2==0){
              for(int c=0;c<n;c++){
                  System.out.print(mat[r][c]+" ");
              }
          }else{
              for(int c=n-1;c>=0;c--){
                  System.out.print(mat[r][c]+" ");
              }
          }
            System.out.println();
        }
    }
}
class SumOfTheIndividualRows{
    public static void sumOfRows(int [][]mat) {
        int m =mat.length;
        int n=mat[0].length;

        for(int r=0;r<m;r++){
            int sum=0;
           for(int c=0;c<n;c++){
             sum+=mat[r][c];
           }
            System.out.println(sum +" ");
        }
    }
}
class MaxValueColWise{
    public static void colWiseMaxValue(int [][]mat){
        int m =mat.length;
        int n=mat[0].length;

        for(int c=0;c<n;c++){
            int max =Integer.MIN_VALUE;
            for(int r=0;r<m;r++){
                if(mat[r][c] > max){
                    max=mat[r][c];
                }
            }
            System.out.println("Max element in column " + c + ": " + max);
        }
    }
}
class MinValueColWise{
    public static void mivWiseRow(int [][]mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int r=0;r<m;r++){
            int minEle=Integer.MAX_VALUE;
            for(int c=0;c<n;c++){
                if(mat[r][c]<minEle){
                    minEle=mat[r][c];
                }
            }
            System.out.println("Min ele in Row "+ r +": "+minEle);
        }
    }
    public static void maxWiseRow(int [][]mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int r=0;r<m;r++){
            int maxEle=Integer.MIN_VALUE;
            for(int c=0;c<n;c++){
                if(mat[r][c]>maxEle){
                    maxEle=mat[r][c];
                }
            }
            System.out.println("Max ele in Row "+ r +": "+maxEle);
        }
    }
    public static void minWiseCol(int [][]mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int c=0;c<n;c++){
            int minValue=Integer.MAX_VALUE;
            for(int r=0;r<n;r++){
                if(mat[r][c]< minValue){
                    minValue=mat[r][c];
                }
            }
            System.out.println("Min ele in col "+ c +": "+minValue);
        }
    }
}
/*
input
3

4 1 2
7 4 4
3 7 4

Output 1:

4 1 2 4 4 7 3 7 4
 */
class Left2Right{
   public static void leftToRightInSingleLine(int [][]mat){
       int m= mat.length;
       int n=mat[0].length;

   }
}

class MainClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int m =sc.nextInt();
        System.out.println("enter col");
        int n =sc.nextInt();
        int [][] mat = new int[m][n];
        System.out.println("enter elements");
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                mat[r][c]= sc.nextInt();
            }
        }
        MinValueColWise.minWiseCol(mat);
        System.out.println("*******************************************");
        MinValueColWise.maxWiseRow(mat);
        System.out.println("+++++++++++++++++++++++===========================");
        MinValueColWise.mivWiseRow(mat);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        MaxValueColWise.colWiseMaxValue(mat);
        System.out.println("_______________________________________________________");
        SumOfTheIndividualRows.sumOfRows(mat);
        System.out.println("___________________________________________________");
        LeftToRight.evencolRevereseOrder(mat);
        System.out.println("___________________________________________________");

        System.out.println("Sum of the array is : "+SumOf2DArray.findsum(mat));
    }
}
