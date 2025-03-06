package Week4.Mar4;

public class Main {
    public static void main(String... args) throws Exception {
        System.out.println("Hello from main!");

        Info i = new Info();
        i.sid = 20000;
        System.out.println("Main: " + i.sid);


        Thread t4 = new Thread(() -> {
            System.out.println(i.sid);
        });
        t4.start();


        Thread.sleep(5000);
        System.out.println("Bye from main!"); 
    }
}



// public class Main {
//     // static int sid = 20458;
//     public static void main(String... args) throws Exception {
//         System.out.println("Hello from main!");

//         Thread t1 = new Thread(new Task1());
//         t1.start();

//         System.out.println(Info.sid);

//         Thread.sleep(1000);
//         System.out.println("Bye from main!"); 
//     }
// }




// public class Main {
//     // static int sid = 20458;
//     public static void main(String... args) throws Exception {
//         System.out.println("Hello from main!");

//         Info i = new Info();
//         i.sid = 20000;
//         System.out.println("Main: " + i.sid);

//         Thread t1 = new Thread(new Task1());
//         t1.start();

//         Thread.sleep(1000);
//         System.out.println("Bye from main!"); 
//     }
// }




// public class Main {
//     // static int sid = 20458;
//     public static void main(String... args) throws Exception {
//         System.out.println("Hello from main!");

//         Info i = new Info();
//         i.sid = 20000;
//         System.out.println("Main: " + i.sid);

//         Thread t1 = new Thread(new Task1(i)); //This is passing by reference because we pass an instance of a class, reference, pointer
//         t1.start();

//         Thread.sleep(5000);
//         i.sid = 500;
//         System.out.println("Bye from main!"); 
//     }
// }




// public class Main {
//     public static void main(String... args) throws Exception {
//         System.out.println("Hello from main!");

//         Info i = new Info();
//         i.sid = 20000;
//         System.out.println("Main: " + i.sid);

//         Thread t1 = new Thread(new Task1(i.sid)); //This is passing by value because we pass an instance variable
//         t1.start();

//         Thread.sleep(5000);
//         i.sid = 500;
//         System.out.println("Bye from main!"); 
//     }
// }



// public class Main {
//     public static void main(String... args) throws Exception {
//         System.out.println("Hello from main!");

//         Info i = new Info();
//         i.sid = 20000;
//         System.out.println("Main: " + i.sid);


//         Thread t3 = new Thread() {
//             public void run() {
//                 System.out.println(i.sid);
//             }
//         };
//         t3.start();

//         Thread.sleep(5000);
//         System.out.println("Bye from main!"); 
//     }
// }