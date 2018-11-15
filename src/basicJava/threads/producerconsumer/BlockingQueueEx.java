package basicJava.threads.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        Producer1 producer = new Producer1(blockingQueue);
        Consumer1 consumer = new Consumer1(blockingQueue);

        producer.start();
        consumer.start();
    }
}

class Producer1 extends Thread {

    BlockingQueue blockingQueue;

    Producer1(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        for (int i=1;i<10;i++){
            try {
                blockingQueue.put(i);
                System.out.println("Producer :"+i);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Consumer1 extends Thread {

    BlockingQueue blockingQueue;

    Consumer1(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        while (true){
            try {

                System.out.println("Consumer :"+blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
