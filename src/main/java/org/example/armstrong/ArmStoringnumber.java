package org.example.armstrong;

public class ArmStoringnumber {
    public static void main(String[] args) {
        int n =153;

        int sum=0,digit=0,temp=n;

        while (temp>0){
            temp/=10;
            digit++;

        }
        temp=n;
        while (temp>0)
        {
           int dif= temp%10;
           sum+= (int) Math.pow(dif,digit);

          temp/=10;
        }

        if(sum == n){
            System.out.println("armstrong");
        }else {
            System.out.println("not");
        }
    }
}
