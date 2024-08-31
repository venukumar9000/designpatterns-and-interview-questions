package org.example.encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {
        Bank bank = new Bank(10000.00);

        bank.deposit(200.00);

        System.out.println("balance after depositing "+bank.getBalance());

        bank.withdraw(5000.00);
        System.out.println("withdraw 5000 and remaining amount is "+bank.getBalance());

    }
}
