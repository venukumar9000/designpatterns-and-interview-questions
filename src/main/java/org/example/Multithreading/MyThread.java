package org.example.Multithreading;

public class MyThread extends Thread{

    public void run(){
        System.out.println("the thread is running now");
    }
}
class Main{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
