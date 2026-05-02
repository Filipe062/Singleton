package gof;

/**
 * Singleton "apressado".
 */

public class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return singletonEager;
    }
}
