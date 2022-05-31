package chap17.printer;

import chap17.Printable;

public class LPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From LG printer >>" + doc);
    }
}
