package org.example.singleton;

public class LazyInstallazationSingleTon {

    public static  LazyInstallazationSingleTon INSTANCE;

    private LazyInstallazationSingleTon(){

    }

    public static LazyInstallazationSingleTon getInstance(){
        if(INSTANCE ==null){
            return new LazyInstallazationSingleTon();
        }
        return INSTANCE;
    }

}
