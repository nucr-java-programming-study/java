package chap17.printer;

import chap17.Contents;
import chap17.markerInterface.Upper;

public class Report implements Contents, Upper {
    String cons;

    public Report(String cons) {
        this.cons = cons;
    }

    public String getContents(){
        return cons;
    }
}
