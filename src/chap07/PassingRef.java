package chap07;

import chap07.Account.BankAccount;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ref = new BankAccount();

        ref.deposit(3000);
        ref.withdraw(300);

        check(ref); // 참조값 전달
    }

    public static void check(BankAccount acc){
        acc.checkMyBalance();
    }
}
