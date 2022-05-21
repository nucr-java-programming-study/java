package chap17;

public class Printer implements Printable{
    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}
