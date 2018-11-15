package basicJava.threads;

public class RunnableEx {

    public static void main(String[] args) {

        Thread t = new Thread(new HelloWordRunnable());
        t.setName("Thread1");
        t.start();

        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setName("Thread2");
        t1.start();
    }
}
