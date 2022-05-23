package chap17;

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);

        System.out.println();

        // LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}
