package org.example.singleton;

public class ThreadSafeLazyInstallazation {

    private static  ThreadSafeLazyInstallazation instance;

    private ThreadSafeLazyInstallazation(){

    }
  synchronized   public static ThreadSafeLazyInstallazation getInstance(){
        if(instance ==null){
            return new ThreadSafeLazyInstallazation();
        }
        return instance;
    }
}
