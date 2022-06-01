package chap07;

import chap07.Account.BankAccount;
import chap07.Account.BankAccountConstructor;
import chap07.Account.BankAccountUniID;

public class BankAccountTest {
    public static void main(String[] args) {
        testCreateInstance();
        testUniqID();
        testConstructor();
    }

    public static void testCreateInstance(){
        System.out.println(">>>>>>testCreateInstance>>>>>>>");
        // 두 개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }

    public static void testUniqID(){
        System.out.println(">>>>>>testUniqID>>>>>>>");

        BankAccountUniID yoon = new BankAccountUniID();
        yoon.initAccount("12-34-89", "990990-9090990", 10000);

        BankAccountUniID park = new BankAccountUniID();
        park.initAccount("33-55-09", "770088-5959007", 10000);

        yoon.deposit(5000);
        park.deposit(3000);

        yoon.withdraw(2000);
        park.withdraw(2000);

        yoon.checkMyBalance();
        park.checkMyBalance();
    }

    public static void testConstructor(){
        System.out.println(">>>>>>testConstructor>>>>>>>");

        BankAccountConstructor yoon = new BankAccountConstructor("12-34-89", "990990-9090990", 10000);
        BankAccountConstructor park = new BankAccountConstructor("33-55-09", "770088-5959007", 10000);

        yoon.deposit(5000);
        park.deposit(3000);

        yoon.withdraw(2000);
        park.withdraw(2000);

        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
