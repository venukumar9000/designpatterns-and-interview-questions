package org.example.Multithreading;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running runnable");
    }
}
class RunnableMain{
    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread thread = new Thread(runnableInterface);
        thread.start();

    }
}
