package Week5.Mar13;

import java.util.concurrent.locks.*;


public class Student {
    
    // Keep the primitive data types, we need them!
    private int id;
    private float gpa;
    // private final ReentrantLock idLock, gpaLock; // It cannot be assingned to something else, inside the class and outside

    // Just for demonstration
    private Object idLock, gpaLock;

    public Student() {
        idLock = new ReentrantLock();
        gpaLock = new ReentrantLock();
    }


    public int getId() {
        synchronized(idLock) { // Here, we are locking the idLock object, not the current object
            return id;
        }
        // try {
        //     idLock.lock();
        //     return id;
        // }finally{
        //     idLock.unlock();
        // }
    }

    public float getGpa() {
        synchronized(gpaLock) { // Same
            return gpa;
        }
        // try {
        //     gpaLock.lock();
        //     return gpa;
        // }finally{
        //     gpaLock.unlock();
        // }
    }


    public synchronized void setId(int id) {
        this.id = id;
    }


    public synchronized void setGpa(float gpa) {
        this.gpa = gpa;
    }

}


class Students {  // s indicates having data structure
    // Even the elements of the student class is thread-safe, this array is not.
    Student arr[] = new Student[100];
}








// public class Student {
//     // This is incorrect, sync is for methods
//     // synchronized int id;
//     // synchronized float gpa;
//     // synchronized String name;

//     private int id;
//     private float gpa;
//     private String name;


//     public synchronized int getId() {
//         return id;
//     }

//     public synchronized void setId(int id) {
//         this.id = id;
//     }

//     public synchronized float getGpa() {
//         return gpa;
//     }

//     public synchronized void setGpa(float gpa) {
//         this.gpa = gpa;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// class Students {  // s indicates having data structure
//     // Even the elements of the student class is thread-safe, this array is not.
//     Student arr[] = new Student[100];
// }








// public class Student {
    
//     private int id;
//     private float gpa;
    
//     // Make it private, do not expose it
//     private ReentrantLock idLock = new ReentrantLock();
//     private ReentrantLock gpaLock = new ReentrantLock();

//     public int getId() {
//         try {
//             idLock.lock();
//             return id;
//         }finally{
//             idLock.unlock();
//         }
//     }

//     public float getGpa() {
//         try{
//             gpaLock.lock();
//             return gpa;
//         }finally{
//             gpaLock.unlock();
//         }
//     }


//     public synchronized void setId(int id) {
//         this.id = id;
//     }


//     public synchronized void setGpa(float gpa) {
//         this.gpa = gpa;
//     }

// }

// class Students {  // s indicates having data structure
//     // Even the elements of the student class is thread-safe, this array is not.
//     Student arr[] = new Student[100];
// }







// public class Student {
    
//     private int id;
//     private float gpa;
//     private final ReentrantLock idLock, gpaLock; // It cannot be assingned to something else, inside the class and outside


//     public Student() {
//         idLock = new ReentrantLock();
//         gpaLock = new ReentrantLock();
//     }


//     public int getId() {
//         try {
//             idLock.lock();
//             return id;
//         }finally{
//             idLock.unlock();
//         }
//     }

//     public float getGpa() {
//         try {
//             gpaLock.lock();
//             return gpa;
//         }finally{
//             gpaLock.unlock();
//         }
//     }


//     public synchronized void setId(int id) {
//         this.id = id;
//     }


//     public synchronized void setGpa(float gpa) {
//         this.gpa = gpa;
//     }

// }

// class Students {  // s indicates having data structure
//     // Even the elements of the student class is thread-safe, this array is not.
//     Student arr[] = new Student[100];
// }










// class Students {  // s indicates having data structure
//     // Even the elements of the student class is thread-safe, this array is not.
//     Student arr[] = new Student[100];
// }