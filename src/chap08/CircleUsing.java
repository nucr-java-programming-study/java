package chap08;

public class CircleUsing {
    public static void main(String args[]) {
        chap08.src.circle1.Circle c1 = new chap08.src.circle1.Circle(3.5);
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());

        chap08.src.circle2.Circle c2 = new chap08.src.circle2.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레: " + c2.getPerimeter());
    }
}
