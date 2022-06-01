package chap08;

import chap08.src.circle1.Circle;

public class CircleImport {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        chap08.src.circle2.Circle circle2 = new chap08.src.circle2.Circle(3.5);
    }
}
