package basicJava.threads;

public class SynchronizationStatic {

    public synchronized void displayValue(){
        for (int i=0;i<10;i++){
            System.out.println("Synchronized Display Method :"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void displayValue1(){
        for (int i=0;i<10;i++){
            System.out.println("Static Synchronized Display Method 1:"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void showValue(){
        for (int i=10;i<20;i++){
            System.out.println("Non Synchronized Show Method :"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void showValue1(){
        for (int i=10;i<20;i++){
            System.out.println("Static Synchronized Show Method :"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printValue(){
        for (int i=0;i<10;i++){
            System.out.println("Synchronized Print Method :"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void printValue1(){
        for (int i=0;i<10;i++){
            System.out.println("Static Synchronized Print Method :"+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
