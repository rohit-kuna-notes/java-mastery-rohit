package synchronization;

public class _2ThreadWithSyncMethod {

    // TODO: private static int count=0;

    private static synchronized void increment(){
        // TODO: count++;
    }

    private static synchronized void decrement(){
        // TODO: count--;
    }

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            for(int i=0;i<=1000;i++){
                // TODO: increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=1000;i++){
                // TODO: decrement();
            }
        });

        // TODO: t1.start();
        // TODO: t2.start();

        try {
            // TODO: t1.join();
            // TODO: t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // TODO: System.out.println("count: " + count);
    }
}
