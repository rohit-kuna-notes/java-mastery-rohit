package joinThread;
public class _1ThreadPriorityExample {
    public static void main(String[] args){
        Thread t1=new Thread(()->{
            for(int i=0;i<=15;i++){
                // TODO: System.out.println("thread t1 :"+i);
            }
        });

        // TODO: System.out.println(Thread.currentThread().getName()+" : says hi");
        // TODO: t1.setPriority(Thread.MAX_PRIORITY);

        // TODO: t1.start();
    }
}
