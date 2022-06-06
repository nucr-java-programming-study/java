package chap09.AccessLevelModifier;

public class UnsafeCircle {
    double rad = 0; // 원의 반지름
    final double PI = 3.14;

    public UnsafeCircle(double r) {
        setRad(r); // 아래에 정의된 setRad 메소드 호출을 통한 초기화
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea() {
        return (rad * rad) * PI; // 원의 넓이 반환
    }
}

