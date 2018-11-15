package basicJava.threads;

import java.util.concurrent.*;

public class CallableEx {
    public static void main(String[] args) {

        HelloCallable callable = new HelloCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future future = executor.submit(callable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();

    }
}
