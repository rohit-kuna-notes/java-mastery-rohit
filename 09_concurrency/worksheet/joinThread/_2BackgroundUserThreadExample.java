package joinThread;
public class _2BackgroundUserThreadExample {
    public static void main(String[] args) {
        // TODO: Thread bgThread = new Thread(new DaemonHelper());
        // TODO: Thread usrThread = new Thread(new UserThreadHelper());
        // TODO: bgThread.setDaemon(true); // making it as Daemon thread


        // Now starting
        // TODO: bgThread.start();
        // TODO: usrThread.start();

        /*
        // TODO: daemon helper: 1
        // TODO: daemon helper: 2
        // TODO: daemon helper: 3
        // TODO: daemon helper: 4
        // TODO: User thread done with execution

        // TODO: Hence though the count of daemon thread is not complete it is forced to shutdown as user thread execution is complete, user thraed took 5 seconds and daemon thread was said to print count every second
         */
    }
}

class DaemonHelper implements Runnable {
    @Override
    public void run(){
        int count = 0;
        while(count<500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            count++;
            System.out.println("daemon helper: " + count);
        }
    }
}

class UserThreadHelper implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("User thread done with execution");
    }
}

/*
- User threads are given priority
- Bg threads run in the Background
- When usr thread completes, the app closes all bg threads too and shuts down
 */
