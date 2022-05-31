package chap17;

public interface Printable {
//    void print(String doc);

    // 인터페이스의 디폴트 메소드
    default void printCMYK(String doc){
        System.out.println("From general CMYK ver >>" + doc);
    }

    // 인터페이스의 static 메소드
    static void printLine(String str){
        System.out.println(str);
    }

    // 인터페이스의 static 메소드 호출
    default void print(String doc){
        printLine(doc);
    }

    default void printNext(String str){ };
}
