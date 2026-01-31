import java.util.*;

public class Encapsulation {
    static class Banking {

        private int balance=50000;

        void amount(int amt) {
            balance += amt;
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        Banking bank = new Banking();
        bank.amount(amt);
        System.out.println(bank.getBalance());
    }
}