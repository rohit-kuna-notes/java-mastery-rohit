package synchronization;

public class _5SynchronizationMethodLevelBlockingIssueResolution {
    // TODO: private static Integer count1=0;
    // TODO: private static Integer count2=0;

    // TODO: private static Object lock1 = new Object();
    // TODO: private static Object lock2 = new Object();

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                // TODO: increment1();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                // TODO: increment2();
            }
        });

        Thread t3 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                // TODO: decrement1();
            }
        });

        Thread t4 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                // TODO: decrement2();
            }
        });

        // TODO: t1.start();
        // TODO: t2.start();
        // TODO: t3.start();
        // TODO: t4.start();

        try{
            // TODO: t1.join();
            // TODO: t2.join();
            // TODO: t3.join();
            // TODO: t4.join();
        } catch (InterruptedException e){
            // TO-DO
        }

        // TODO: System.out.println("count1: " + count1 + ", count2: " + count2);
    }

    public static void increment1(){
        // TODO: synchronized(lock1) { // when synchronized keyword use at block level, we need to pass lock
            // TODO: count1++;
        }
    }
    public static void increment2(){
        synchronized(lock2){
            // TODO: count2++;
        }
    }
    public static void decrement1(){
        synchronized(lock1){
            // TODO: count1--;
        }

    }
    public static void decrement2(){
        synchronized(lock2){
            // TODO: count2--;
        }
    }
}

// Now the locks are non blocking exclusive
// As each lock is for different objects





