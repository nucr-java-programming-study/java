package etc.designPattern;

public class Singletone {
    private static class singleInstanceHolder{
        // 자기자신을 static으로 가지고있음
        private static final Singletone INSTANCE = new Singletone();
    }

    // 다른 곳에서 new로 생성 못함
    public static synchronized Singletone getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

