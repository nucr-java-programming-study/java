package chap07;

import chap07.Account.BankAccount;

/**
 * 참조변수, 인자, 매개변수
 */
public class Variables {
    public static void main(String[] args) {
        String s1 = "hello world"; // 문자열 선언과 동시에 참조변수로 참조
        BankAccount bc = new BankAccount(); // 인스턴스(객체) 생성
        printMethod(s1); // 인자로 참조변수 전달
    }

    public static String printMethod(String param){ // 매개변수로 문자열을 받음
        System.out.println("input param : " + param);
        return param;
    }
}
