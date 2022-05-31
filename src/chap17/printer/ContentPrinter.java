package chap17.printer;

import chap17.Contents;
import chap17.markerInterface.Lower;
import chap17.markerInterface.Upper;

public class ContentPrinter {
    public void printContents(Contents doc){
        if (doc instanceof Upper){ // doc 참조 인스턴스가 Upper 구현한다면
            System.out.println(doc.getContents().toUpperCase());
        }
        else if (doc instanceof Lower){ // doc 참조 인스턴스가 Lower 구현한다면
            System.out.println(doc.getContents().toLowerCase());
        }
        else {
            System.out.println(doc.getContents());
        }
    }
}
