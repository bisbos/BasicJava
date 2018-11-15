package basicJava.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class HelloCallable implements Callable {


    @Override
    public Object call() throws Exception {
        System.out.println("Hello Callable");
        return "Bisin";
    }
}
