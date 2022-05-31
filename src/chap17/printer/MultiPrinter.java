package chap17.printer;

public class MultiPrinter extends SimplePrinter{
    @Override
    public void printNext(String str) {
        super.printNext("start of multi...");
        super.printNext(str);
        super.printNext("end of multi...");
    }
}
