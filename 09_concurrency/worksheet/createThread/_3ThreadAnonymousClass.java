package createThread;
public class _3ThreadAnonymousClass {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            // TODO: @Override
            public void run(){
                for(int i=0;i<15;i++){
                    // TODO: System.out.println("Thread t1 : "+i);
                }
            }
        });

        // TODO: t1.start();
    }
}
