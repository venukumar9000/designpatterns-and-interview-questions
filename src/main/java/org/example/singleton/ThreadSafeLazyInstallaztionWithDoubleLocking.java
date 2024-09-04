package org.example.singleton;

public class ThreadSafeLazyInstallaztionWithDoubleLocking {

    private static ThreadSafeLazyInstallaztionWithDoubleLocking instance;

    private ThreadSafeLazyInstallaztionWithDoubleLocking(){

    }
    public static ThreadSafeLazyInstallaztionWithDoubleLocking getInstance(){
        if(instance ==null){
            return new ThreadSafeLazyInstallaztionWithDoubleLocking();
        }
        return instance;
    }
}
