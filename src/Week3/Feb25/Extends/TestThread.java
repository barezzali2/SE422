package Week3.Feb25.Extends;

public class TestThread { // This is the process, threads are inside these
    public static void main(String... args) throws Exception {

        Thread1 t1 = new Thread1(); // They are extending Thread class
        Thread2 t2 = new Thread2(); // They are extending Thread class

        t1.start(); // a new thread created by OS, and it will call run
        t2.start(); // a new thread created by OS, and it will call run
    }
}
