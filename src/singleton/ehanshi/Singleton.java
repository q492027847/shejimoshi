package singleton.ehanshi;

public class Singleton {

    // 饿汉式
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
