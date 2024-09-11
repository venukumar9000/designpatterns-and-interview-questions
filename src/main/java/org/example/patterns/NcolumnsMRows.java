package org.example.patterns;

import java.util.Scanner;

public class NcolumnsMRows {

    public static void main(String[] args) {
        pattern16();
        pattern15();
        pattern14();
        pattern13();
        pattern11();
        patter10();
        pattern9();
        pattern8();
        pattern7();
        pattern6();
        pattern4();
        pattern3();
        pattern2();
        pattern1();
        pattern();
    }
    /*
    if input =7
    *
    *2
    *2*
    *2*3
    *2*3*
    *2*3*6
    *2*3*6*
       */
    public static void pattern(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//     int m= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int cnt=1;cnt<=row;cnt++){
                if(cnt%2==0){
                    System.out.print(cnt);
                }else{
                    System.out.println("*");
                }

            }
            System.out.println();

        }
    }

    /*
    input =5
    *____*
    *____*
    *____*
    *____*
    *____*
     */

    public static void pattern1(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int row=1;row<=n;row++){

            for (int cnt=1;cnt<=n;cnt++){
                if((cnt == 1) || (cnt == row)) {
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();

        }
    }
    /*
    input=3
    ***
    **
    *
     */

    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int row=1; row<=n;row++){

            for (int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    /*
    input=5
    *    *
    *   *
    * *
    **
     */

    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int spaces=n-1;
        for (int row=1;row<=n;row++){
            System.out.print("*");
            //spaces
             for(int j=1;j<=spaces;j++){
                 System.out.print(" ");
             }
            System.out.print("*");
            System.out.println();
             spaces--;
        }
    }
    /*
   input =3
      *
     **
    ***
     */

    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {

            //print spaces
        for(int j=1;j<=n-i;j++){
            System.out.print("_");
        }
            //print stars
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }

            System.out.println();
        }
    }

    /*
    input:5
    **********
    ****__****
    ***____***
    **______**
    *________*
    */

    public static void pattern6(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int stars=n;
        int spaces=0;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }

            //print some *
         for(int j=1;j<=spaces;j++){
             System.out.print("-");
         }
            //print spaces --
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }

            System.out.println();
            stars--;
            spaces+=2;
        }
    }

    /*
    input:5
      *
     ***
    *****
   *******
  *********
    */
    public static void pattern7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=n-1;
        int stars=1;
        for (int i=1;i<=n;i++){

            //print spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //print stars
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars+=2;
        }
    }
    /*
    1
    1_
    1_3
    1_3_
    1_3_5
    */

    public static void pattern8(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("_");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    /*
  ____*
  ___**
  __***
  _****
  *****
    */

    public static void pattern9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=n-1;
        int stars=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=spaces;j++) {
                System.out.print("-");
            }
            for (int k=1;k<=stars;k++){
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars++;
        }

    }
    /*
   1 2 3 4
   1 2 3
   1 2
   1
    */
    public static void patter10(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print(j+" ");
//
//            }
//
//            System.out.println();
//        }
        for (int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
     *________* // 8 spaces

     **______** // 6 spaces

     ***____*** // 4 spaces

     ****__**** // 2 spaces

     ********** // 0 spaces
  */

    public static void pattern11(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars=1;
        int spaces=n*2-2;

        for (int i=1;i<=n;i++){

            for (int k=1;k<=stars;k++){
                System.out.print("*");
            }

            for(int j=1;j<=spaces;j++){
                System.out.print("_");
            }
            for(int l=1;l<=stars;l++){
                System.out.print("*");
            }

            System.out.println();
            spaces-=2;
            stars++;
        }
    }
    /*
     ********** // 0 spaces

     ****__**** // 2 spaces

     ***____*** // 4 spaces

     **______** // 6 spaces

     *________* // 8 spaces

     */

    public static void pattern13(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int spaces=0;
        int starts=n;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=starts;j++){
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++){
                System.out.print("-");
            }
            for(int l=1;l<=starts;l++){
                System.out.print("*");
            }
            System.out.println();
            spaces+=2;
            starts--;
        }
    }
    /*

         *
        * *
       * * *
      * * * *
     * * * * *
     */

    public static void pattern14(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
//            for(int k=1;k<=n;k++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
    /*
    input =5
    2*n-1=rows
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *

    */

    public static void pattern15(){
        Scanner sx = new Scanner(System.in);
        int n=sx.nextInt();
        for (int i=1;i<=n;i++){

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    input=5
     * * * * *
      * * * *
       * * *
        * *
         *
    */
    public static void pattern16(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
