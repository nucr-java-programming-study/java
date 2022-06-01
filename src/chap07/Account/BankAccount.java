package chap07.Account;

public class BankAccount {
    int balance = 0;     // 예금 잔액

    /**
     * 입금을 담당하는 메소드
     */
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    /**
     * 출금을 담당하는 메소드
     */
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    /**
     * 예금 조회를 담당하는 메소드
     */
    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
