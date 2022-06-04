package etc.designPattern;

public class Singletone {
    private static class singleInstanceHolder{
        private static final Singletone INSTANCE = new Singletone();
    }
    public static synchronized Singletone getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

