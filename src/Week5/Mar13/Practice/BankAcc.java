package Week5.Mar13.Practice;

import java.util.concurrent.locks.*;

public class BankAcc {
    private int balance = 100;
    private final ReentrantLock lock = new ReentrantLock();

    public void deposit(int amount) {
        try{
            lock.lock();
            this.balance += amount;
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        try{
            lock.lock();
            this.balance -= amount;
        }finally{
            lock.unlock();
        }
    }

    public void getBalance() {
        try{
            lock.lock();
            System.out.println(balance);
        }finally{
            lock.unlock();
        }
    }

    // public int getBalance() {
    //     try{
    //         lock.lock();
    //         return balance;
    //     }finally{
    //         lock.unlock();
    //     }
    // }
}
