package chap09.AccessLevelModifier;

public class SafeCircle {
    private double rad = 0; // 클래스 내부 접근만 허용
    final double PI = 3.14;

    public SafeCircle(double r) {
        setRad(r); // 아래에 정의된 setRad 메소드 호출을 통한 초기화
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getRad() {
        return rad;
    }

    public double getArea() {
        return (rad * rad) * PI; // 원의 넓이 반환
    }
}
