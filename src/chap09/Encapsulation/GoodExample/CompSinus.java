package chap09.Encapsulation.GoodExample;

import chap09.Encapsulation.BadExample.SinivelCap;
import chap09.Encapsulation.BadExample.SneezeCap;
import chap09.Encapsulation.BadExample.SnuffleCap;

public class CompSinus {
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    public void take(){
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}
