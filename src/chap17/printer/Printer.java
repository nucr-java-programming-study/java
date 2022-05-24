package chap17.printer;

import chap17.Printable;

public class Printer implements Printable {
    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}
