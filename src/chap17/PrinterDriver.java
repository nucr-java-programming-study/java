package chap17;

import chap17.printer.*;

import java.awt.*;

public class PrinterDriver {
    public static void main(String[] args) {

        String myDoc = "This is a report about...";

//        printerTest();
//        printDriver1(myDoc);
//        printDriver2(myDoc);
//        printerDriver3(myDoc);
//        printerDriver4(myDoc);
//        simplePrinter(myDoc);
//        instanceOfInterface(myDoc);
        makerInterface();
    }

    public static void printerTest(){
        System.out.println("====printerTest====");

        Printable prn = new Printer();
        prn.print("Hello Java");
    }

    public static void printDriver1(String myDoc){
        System.out.println("====printDriver1====");

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);

        // LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }

    public static void printDriver2(String myDoc){
        System.out.println("====printDriver2====");
        Printable prn = new Prn204Drv(); // 참조형 변수
        prn.print(myDoc);

        prn = new Prn731Drv();
        prn.print(myDoc);
    }

    public static void printerDriver3(String myDoc){
        System.out.println("====printerDriver3====");
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);
        prn.printCMYK(myDoc);
    }

    public static void printerDriver4(String myDoc){
        System.out.println("====printerDriver4====");
        Printable prn1 = new Prn731Drv();
        prn1.print(myDoc);
        prn1.printCMYK(myDoc);

        Printable prn2 = new Prn909Drv();
        prn2.print(myDoc);
        prn2.printCMYK(myDoc);
    }

    public static void simplePrinter(String myDoc){
        System.out.println("====simplePrinter====");
        Printable prn = new Printer();
        prn.print(myDoc);

        //인터페이스의 static 메소드 직접 호출
        Printable.printLine("end of line");
    }

    public static void instanceOfInterface(String myDoc){
        Printable prn1 = new SimplePrinter();
        Printable prn2 = new MultiPrinter();

        if(prn1 instanceof Printable){
            prn1.printNext("This is a simple printer.");
        }
        if(prn2 instanceof Printable){
            prn2.printNext("This is a multiful printer.");
        }
    }

    public static void makerInterface(){
        ContentPrinter prn = new ContentPrinter();
        Report doc = new Report("Simple Funny News~");
        prn.printContents(doc);
    }
}
