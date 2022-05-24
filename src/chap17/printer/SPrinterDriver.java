package chap17.printer;

import chap17.Printable;

public class SPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer >>" + doc);
    }
}
