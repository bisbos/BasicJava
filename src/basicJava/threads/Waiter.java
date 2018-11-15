package basicJava.threads;

public class Waiter implements Runnable {

    SynchronizationStatic stat;
    Waiter(SynchronizationStatic stat){
        this.stat = stat;
    }

    @Override
    public void run(){
        SynchronizationStatic.displayValue1();
    }


}
