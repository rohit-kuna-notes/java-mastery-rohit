package synchronization;

public class _4SynchronizationMethodLevelBlockingIssue {
    // TODO: private static int count1=0;
    // TODO: private static int count2=0;
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

    public static synchronized void increment1(){
        // TODO: count1++;
    }
    public static synchronized void increment2(){
        // TODO: count2++;
    }
    public static synchronized void decrement1(){
        // TODO: count1--;
    }
    public static synchronized void decrement2(){
        // TODO: count2--;
    }
}

// Now increment1/decrement1 is working on a diff resource from increment2/decrement2, i.e. count1 and count2
// but as these methods are static it occupies class level lock as there is a ingle class level monitor


