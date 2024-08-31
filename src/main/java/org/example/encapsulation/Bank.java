package org.example.encapsulation;

public class Bank {

   private  double balance;

   public Bank(double initalAmount){
       this.balance= initalAmount;

   }
   public  void deposit(double amount){
       if(amount > 0){
           balance +=amount;
       }
   }
   public void withdraw(double amount){
       if(amount > 0 &&  amount <=balance){
           balance-=amount;
       }
   }
   public double getBalance(){
       return balance;
   }
}
