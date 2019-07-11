package basicJava.threads.producerconsumer;

public class ProducerConsumerEx {

    public static void main(String[] args) {

        NumberBucket numberBucket = new NumberBucket();
        Producer producer = new Producer(numberBucket);
        Consumer consumer = new Consumer(numberBucket);

        producer.start();
        consumer.start();
    }
}

class NumberBucket {

    private int data;
    private boolean empty = false;

    public synchronized void produce(int data){
        while (empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        empty = true;
        notifyAll();
    }

    public synchronized int consume(){
        while (!empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        notifyAll();
        return this.data;
    }
}

class Producer extends Thread {

    NumberBucket bucket;

    Producer(NumberBucket bucket){
        this.bucket = bucket;
    }

    @Override
    public void run() {
        for (int i=1;i<10;i++){
            bucket.produce(i);
            System.out.println("Producer :"+i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Consumer  extends Thread {

    NumberBucket bucket;

    Consumer(NumberBucket bucket){
        this.bucket = bucket;
    }

    @Override
    public void run() {
        int value =0;
        for (int i=0;i<10;i++){
            value = bucket.consume();
            System.out.println("Consumer :"+value);
        }
    }
}



