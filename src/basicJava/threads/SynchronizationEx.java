package basicJava.threads;

public class SynchronizationEx {

    public static void main(String[] args) {

        SynchronizationStatic stat = new SynchronizationStatic();
       Thread waiter = new Thread(new Waiter(stat));
       waiter.setName("Waiter0");
       waiter.start();

        Thread waiter1 = new Thread(new Waiter(stat));
        waiter1.setName("Waiter1");
        waiter1.start();

        Thread waiter2 = new Thread(new Waiter(stat));
        waiter2.setName("Waiter2");
        waiter2.start();

/*        try {
            waiter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } */

      Thread notifier = new Thread(new Notifier(stat));
       notifier.setName("notifier");
       notifier.start();

    }
}
