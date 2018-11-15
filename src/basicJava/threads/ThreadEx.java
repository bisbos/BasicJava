package basicJava.threads;

public class ThreadEx extends Thread {

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadEx threadEx = new ThreadEx();
        threadEx.start();
    }
}
