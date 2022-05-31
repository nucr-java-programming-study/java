package chap17;

public interface ColorPrintable extends Printable{ // Printable을 상속하는 인터페이스
    void printCMYK(String doc);
}
