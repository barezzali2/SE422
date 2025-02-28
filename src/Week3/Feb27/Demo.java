package Week3.Feb27;

public class Demo {
    public static void main(String... args) {
        System.out.println("Main starts");

        Runnable r = () -> { // The code of the method that does not need any argument is this, that method is the run method
            for(int i = 0; i < 10; i++) {
                System.out.println("Loop" + i);
            }    
        };

        new Thread(r).start();
        

        System.out.println("Main ends");
    }
}



// 1st quarter of the class
// System.out.println("Main starts");

//         // PrintLoopTask task1 = new PrintLoopTask();
//         Thread task1 = new PrintLoopTask();
//         // task1.run();
//         task1.start();

//         System.out.println("Main ends");




// 2nd
// Thread t1 = new Thread() { // Create me a class on the fly! Anonymous class, this class extends Thread
//     public void run() {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Loop" + i);
//         }    
//     }
// };
// t1.start();




// 3rd
// PrintLoopTask task1 = new PrintLoopTask();
//         Thread thread = new Thread(task1); // One of the Thread constructors accepts Runnable reference
//         thread.start();



// 4rd
// Runnable r = new Runnable() { // Data type -- > Anonymous
//     @Override
//     public void run() {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Loop" + i);
//         }  
//     }    
// };

// new Thread(r).start();