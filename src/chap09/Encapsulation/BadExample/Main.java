package chap09.Encapsulation.BadExample;

import chap09.Encapsulation.ColdPatient;

public class Main {
    public static void main(String[] args) {
        ColdPatient patient = new ColdPatient();

        patient.takeSinivelCap(new SinivelCap());
        patient.takeSneezeCap(new SneezeCap());
        patient.takeSnuffleCap(new SnuffleCap());
    }
}
