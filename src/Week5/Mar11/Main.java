package Week5.Mar11;

public class Main {
    public static void main(String... args) {
        Algo1 alg1 = new Algo1();

        Thread t1 = new Thread(() -> {
            alg1.method2();
            // System.out.println(alg1.printRes());
        });

        Thread t2 = new Thread(() -> {
            alg1.method2();
            // System.out.println(alg1.printRes());
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(Exception ex) {
            System.err.println(ex);
        }
    }
}






// public class Main {
//     public static void main(String... args) {
//         Algo1 alg1 = new Algo1();

//         Thread t1 = new Thread(() -> {
//             alg1.method2();
//             System.out.println(alg1.printResult());
//         });

//         Thread t2 = new Thread(() -> {
//             alg1.method2();
//             System.out.println(alg1.printResult());
//         });

//         Thread t3 = new Thread(() -> {
//             alg1.method2();
//             System.out.println(alg1.printResult());
//         });

//         t1.start();
//         t2.start();
//         t3.start();

//         try {
//             t1.join();
//             t2.join();
//             t3.join();
//         }catch(Exception ex) {
//             System.err.println(ex);
//         }
//     }
// }