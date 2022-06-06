package chap09.AccessLevelModifier;

public class CircleMain {
    public static void main(String[] args) {
        System.out.println(">>>> 은닉 X >>>>");
        UnsafeCircle c = new UnsafeCircle(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());

        c.rad = -4.5; // 옳지 않은 접근 방법
        System.out.println(c.getArea());

        System.out.println(">>>> 은닉 O >>>>");
        SafeCircle sc = new SafeCircle(1.5);
        System.out.println("반지름: " + sc.getRad());
        System.out.println("넓이: " + sc.getArea() + "\n");

        sc.setRad(3.4);
        System.out.println("반지름: " + sc.getRad());
        System.out.println("넓이: " + sc.getArea());
    }
}
