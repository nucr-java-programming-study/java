package chap09.Encapsulation.GoodExample;

public class SinusCap {
    void sniTake(){
        System.out.println("콧물 치료");
    }
    void sneTake(){
        System.out.println("재채기 치료");
    }
    void snuTake(){
        System.out.println("코막힘 치료");
    }

    // 약 복용 순서가 담긴 메소드
    public void take(){
        sniTake();
        sneTake();
        snuTake();
    }
}
