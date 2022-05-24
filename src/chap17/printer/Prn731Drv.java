package chap17.printer;

import chap17.Printable;

public class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer >>" + doc);
    }
}
