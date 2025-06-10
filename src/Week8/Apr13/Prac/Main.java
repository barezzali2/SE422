package Week8.Apr13.Prac;

import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try{
                for(int i = 0; i < 5; i++) {
                    System.out.println("Producing " + i);
                    Student s = new Student();
                    s.studentId = i;
                    queue.put(s.studentId);
                    System.out.println("Produced " + i);
                }

                // queue.put();

            }catch(Exception ex) {
                System.err.println(ex);
            }
        });


        Thread consumer = new Thread(() -> {
            int counter = 0;
            try{
                while(counter < 5){
                    int student = queue.take();
                    System.out.println("Consuming " + student);
                    counter++;
                }
                System.out.println("All Consumed");


            }catch(Exception ex) {
                System.err.println(ex);
            }
        });



        producer.start();
        consumer.start();
    }
}



class Student{
    public int studentId;
}