package interThreadCommunication;

public class WaitAndNotify {
    // TODO: private static final Object LOCK = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            try {
                synchronized(LOCK){
                    // TODO: System.out.println(Thread.currentThread().getName() + " - before");
                    // TODO: LOCK.wait(); // will stop the further code execution instantly
                    // TODO: System.out.println(Thread.currentThread().getName() + " - after");
                }
            } catch (InterruptedException e) {
                // TODO: Thread.currentThread().interrupt();
                // TODO: handle exception
            }
        });

        Thread t2 = new Thread(()->{
            synchronized(LOCK){
                // TODO: System.out.println(Thread.currentThread().getName() + " - before");
                // TODO: LOCK.notify(); // won't stop the further process instantly but wait for the further all calls to process before notifiying
                // TODO: System.out.println(Thread.currentThread().getName() + " - after");
            }
        });

        // TODO: t1.start();
        // TODO: t2.start();
    }
}

/*
 * wait : makes the thread wait for some reason
 * sleep : makes the thread pause execution for given duration
 *
 * notify : randomly wakes up a thread waiting for lock
 * notifyAll : wakes up all threads waiting for a lock
 */
