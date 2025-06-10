package Week9.Apr24;

public class AddCAS {
    
    public final int add(int num) {

        for(int i = 0; i < num; i++) { // 1st solution --- O(n)
            incrementAndGet();
        }
    }


    // public final int add2(int num) { // 2nd solution
    //     int prev, next;
    //     do{
    //         prev = get(); // get the value
    //         next = prev + num; // increment, O1
    //     }while(!compareAndSet(prev, next)); // retry until successful
    //     return next;
    // }


    public final int add2(int num) { // 2nd solution
        int prev, next;
        do{
            prev = get(); // get the value
            next = prev + num; // increment, O1
            // this while may cause delay! it has affect
            // only way to reduce the affect of this is removing the contention
            // by creating a data structure, we can remove the contention
        }while(!compareAndSet(prev, next)); // retry until successful
        return next;
    }
}
