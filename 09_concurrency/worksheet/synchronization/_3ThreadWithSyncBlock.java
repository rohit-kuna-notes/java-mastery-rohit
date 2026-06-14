package synchronization;

public class _3ThreadWithSyncBlock {

    // TODO: private static int count=0;

    private static void increment(){
        // TODO: count++;
    }

    private static void decrement(){
        // TODO: count--;
    }

    // TODO: private static Object LOCK = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=0;i<=1000;i++){
                synchronized(LOCK){
                    // TODO: increment();
                }
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=1000;i++){
                synchronized(LOCK){
                    // TODO: decrement();
                }
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
