public class SingletonExample {
    
    private SingletonExample(){

    }

    private static SingletonExample instance;
    
    public static SingletonExample getInstance(){

        if (instance == null) {
            instance = new SingletonExample();
        }


        return instance;
    }
}
