package chap09.Encapsulation.GoodExample;

import chap09.Encapsulation.ColdPatient;

public class Main {
    public static void main(String[] args) {
        ColdPatient patient = new ColdPatient();
        patient.takeSinusCap(new SinusCap());
        patient.takeCompSinusCap(new CompSinus());
    }
}
