package basicJava.threads;

public class Notifier implements Runnable {

    SynchronizationStatic stat;
    Notifier( SynchronizationStatic stat){
        this.stat = stat;
    }

    @Override
    public void run(){
        stat.printValue();
    }
}
