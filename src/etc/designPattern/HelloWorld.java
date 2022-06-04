package etc.designPattern;

public class HelloWorld {
    public static void main(String[] args) {
        Singletone a = Singletone.getInstance();
        Singletone b = Singletone.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if(a==b){
            System.out.println(true);
        }
    }
}
