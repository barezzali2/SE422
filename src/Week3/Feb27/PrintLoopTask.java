package Week3.Feb27;

public class PrintLoopTask implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Loop" + i);
        }    
    }
}



// public class PrintLoopTask extends Thread {

//     @Override
//     public void run() {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Loop" + i);
//         }    
//     }
// }