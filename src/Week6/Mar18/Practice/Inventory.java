package Week6.Mar18.Practice;

import java.util.concurrent.locks.*;

public class Inventory {

    private int item = 0;
    private final ReentrantReadWriteLock itemLock;

    public Inventory() {
        itemLock = new ReentrantReadWriteLock();
    }


    public void addItem(int amount) {
        try{
            itemLock.writeLock().lock();
            item += amount;
        }finally{
            itemLock.writeLock().unlock();
        }
    }


    public void removeItem(int amount) {
        try{
            itemLock.writeLock().lock();
            item -= amount;
        }finally{
            itemLock.writeLock().unlock();
        }
    }


    public int getItems() {
        try{
            itemLock.readLock().lock();
            return item;
        }finally{
            itemLock.readLock().unlock();
        }
    }
}
