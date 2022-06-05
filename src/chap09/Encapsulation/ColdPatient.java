package chap09.Encapsulation;

import chap09.Encapsulation.BadExample.SinivelCap;
import chap09.Encapsulation.BadExample.SneezeCap;
import chap09.Encapsulation.BadExample.SnuffleCap;
import chap09.Encapsulation.GoodExample.CompSinus;
import chap09.Encapsulation.GoodExample.SinusCap;

public class ColdPatient {
    public void takeSinivelCap(SinivelCap cap){
        cap.take();
    }
    public void takeSneezeCap(SneezeCap cap){
        cap.take();
    }
    public void takeSnuffleCap(SnuffleCap cap){
        cap.take();
    }
    public void takeSinusCap(SinusCap cap){
        cap.take();
    }
    public void takeCompSinusCap(CompSinus cap){
        cap.take();
    }
}
