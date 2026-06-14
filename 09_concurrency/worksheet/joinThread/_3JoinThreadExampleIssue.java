package joinThread;
public class _3JoinThreadExampleIssue {
    public static void main(String[] args) {
        Thread t1 =new Thread(()->{
            for(int i=0;i<=5;i++){
                // TODO: System.out.println("Thread t1: "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=10;i++){
                // TODO: System.out.println("Thread t2: "+i);
            }
        });

        // TODO: t1.start();
        // TODO: t2.start();
        // TODO: System.out.println("Done executing the threads");

        /*
         *  OP : Done executing the threads
            // TODO: Thread t1: 0
            // TODO: Thread t1: 1
            // TODO: Thread t1: 2
            // TODO: Thread t1: 3
         */

        /*
         * We want the Done exceuting to be printed first and then t1 and t2,
        // TODO: But here that doesn't happen as main thread executes it's things first, though the threads do start
         */
    }
}
