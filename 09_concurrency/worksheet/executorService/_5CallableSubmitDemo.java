package executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _5CallableSubmitDemo {
    public static void main(String[] args) {
        // TODO: CallableTask callableTask=new CallableTask();
        // TODO: ExecutorService service = Executors.newFixedThreadPool(3);
        // TODO: Future<Integer> future = service.submit(callableTask);

        try {
            // TODO: int result = future.get();
            // TODO: System.out.println(result);
        } catch (InterruptedException ie) {
            // TODO: Thread.currentThread().interrupt();
            // TODO: throw new RuntimeException(ie);
        } catch (ExecutionException ex) {
            // TODO: throw new RuntimeException(ex);
        }

    }
}

class CallableTask implements Callable<Integer> {
    @Override
    public Integer call(){
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ie){
            Thread.currentThread().interrupt();
            throw new RuntimeException(ie);
        }

        return 1;
    }
}
