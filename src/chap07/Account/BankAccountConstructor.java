package chap07.Account;

public class BankAccountConstructor {
    String accNumber;     // 계좌번호
    String ssNumber;     // 주민번호
    int balance = 0;     // 예금 잔액

    // 생성자
    public BankAccountConstructor(String accNumber, String ssNumber, int balance) {
        this.accNumber = accNumber;
        this.ssNumber = ssNumber;
        this.balance = balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔    액: " + balance + '\n');
        return balance;
    }
}
