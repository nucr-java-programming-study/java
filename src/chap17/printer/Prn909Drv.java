package chap17.printer;

import chap17.ColorPrintable;

public class Prn909Drv implements ColorPrintable {
    @Override
    public void printCMYK(String doc) { // 컬러 출력
        System.out.println("From MD-909 CMYK ver >>" + doc);
    }

    @Override
    public void print(String doc) { // 흑백 출력
        System.out.println("From MD-909 black&white ver >>" + doc);
    }
}
