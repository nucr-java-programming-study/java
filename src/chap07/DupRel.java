package chap07;

import chap07.Account.BankAccount;

public class DupRel {
    public static void main(String[] args) {
        BankAccount ref1 = new BankAccount();
        BankAccount ref2 = ref1;

        ref1.deposit(3000);
        ref2.deposit(2000);

        ref1.withdraw(400);
        ref2.withdraw(300);

        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }
}
