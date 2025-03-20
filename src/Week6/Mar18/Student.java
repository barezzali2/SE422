package Week6.Mar18;

import java.util.concurrent.locks.*;


public class Student {

    private final ReentrantReadWriteLock idLock;
    
    // Keep the primitive data types, we need them!
    private int id;
    private float gpa;
    

    public Student() {
        // idLock = new ReentrantReadWriteLock();
        idLock = new ReentrantReadWriteLock(true); // Fairness, we can use this
    }


    public int getId() {
        try {
            idLock.readLock().lock();
            return id;
        }finally{
            idLock.readLock().unlock();
        }
    }



    public void setId(int id) {
        try{
            idLock.writeLock().lock();
            this.id = id;
        }finally{
            idLock.readLock().lock(); // We can obtain it, downgraing, rarely we have this lock
            idLock.writeLock().unlock();


            idLock.readLock().unlock();
        }
    }


}