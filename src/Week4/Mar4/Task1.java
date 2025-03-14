package Week4.Mar4;

public class Task1 implements Runnable {
    
    int obj;
    public Task1(int arg) {
        obj = arg;
    }

    @Override
    public void run() {
        System.out.println("Task 1" + " Hello");

        while(true) {
            System.out.println(obj);
            try{
                Thread.sleep(500);
            }catch(Exception ex) {
                System.err.println(ex);
            }
        }
    }
}


// public class Task1 implements Runnable {

//     @Override
//         public void run() {
//             System.out.println("Task 1" + " Hello");
    
//             System.out.println(Info.sid);
//             try{
//                 Thread.sleep(500);
//             }catch(Exception ex) {
//                 System.err.println(ex);
//             }
//         }

// }




// public class Task1 implements Runnable {


//     @Override
//     public void run() {
//         System.out.println("Task 1" + " Hello");

//         Info i = new Info();
//         System.out.println(i.sid);
//         try{
//             Thread.sleep(500);
//         }catch(Exception ex) {
//             System.err.println(ex);
//         }
//     }
// }



// public class Task1 implements Runnable {
    
//     Info obj;
//     public Task1(Info arg) {
//         obj = arg;
//     }

//     public Task1() {

//     }

//     @Override
//     public void run() {
//         System.out.println("Task 1" + " Hello");

//         System.out.println(obj.sid);
//         try{
//             Thread.sleep(500);
//         }catch(Exception ex) {
//             System.err.println(ex);
//         }
//     }
// }



// public class Task1 implements Runnable {
    
//     int obj;
//     public Task1(int arg) {
//         obj = arg;
//     }

//     public Task1() {
        
//     }

//     @Override
//     public void run() {
//         System.out.println("Task 1" + " Hello");

//         while(true) {
//             System.out.println(obj);
//             try{
//                 Thread.sleep(500);
//             }catch(Exception ex) {
//                 System.err.println(ex);
//             }
//         }
//     }
// }