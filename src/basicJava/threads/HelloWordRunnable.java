package basicJava.threads;

public class HelloWordRunnable implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloWordRunnable());
        t1.setName("Thread1");
        Thread t2 = new Thread(new HelloWordRunnable());
        t2.setName("Thread2");

        t1.start();
        t2.start();
    }

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
