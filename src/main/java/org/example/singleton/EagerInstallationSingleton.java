package org.example.singleton;

public class EagerInstallationSingleton {

    public static final EagerInstallationSingleton EAGER_INSTALLATION_SINGLETON = new EagerInstallationSingleton();

    private EagerInstallationSingleton(){
        System.out.println("Hello world!");
    }

    public static EagerInstallationSingleton getInstance(){

        return EAGER_INSTALLATION_SINGLETON;

    }
}
