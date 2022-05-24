package chap17.printer;

import chap17.Printable;

public class Prn204Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-204 printer >>" + doc);
    }
}
