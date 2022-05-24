package chap17.printer;

import chap17.Printable;

public class SimplePrinter implements Printable {
    @Override
    public void printNext(String str) {
        System.out.println(str);
    }
}
