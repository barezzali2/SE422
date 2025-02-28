package Week3.Feb25.Normal;

public class TestThread {
    public static void main(String... args) throws Exception {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.run();
        t2.run();
    }
}
