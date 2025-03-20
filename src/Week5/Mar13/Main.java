package Week5.Mar13;


public class Main {
    public static void main(String... args) {
        Student s = new Student();
        // If we do not make the reentrant private and encapsulated, someone like Abdulrahman will do this!
        // s.idLock = null;

        Thread t1 = new Thread(() -> {
            s.setId(20458);
            s.setGpa(3.28f);
            System.out.println(s.getId());
            System.out.println(s.getGpa());
        });

        Thread t2 = new Thread(() -> {
            s.setId(23345);
            s.setGpa(3.00f);
            System.out.println(s.getId());
            System.out.println(s.getGpa());
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }catch(Exception ex) {
            System.err.println(ex);
        }

    }
}






// public class Main {
//     public static void main(String... args) {
//         Student s = new Student();
//         // If we do not make the reentrant private and encapsulated, someone like Abdulrahman will do this!
//         // s.idLock = null;
//     }
// }
