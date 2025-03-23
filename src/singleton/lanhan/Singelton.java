package singleton.lanhan;

public class Singelton {

    // 懒汉式
    private static Singelton instance= null;

    private Singelton(){};

    public static Singelton getInstance(){
        if(instance == null){
            synchronized (Singelton.class){
                if(instance == null){
                    instance = new Singelton();
                }
            }
        }
        return instance;
    }
}