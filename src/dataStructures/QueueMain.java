package dataStructures;

public class QueueMain {

    public static void main(String[] args) {

        QueueEx queue = new QueueEx(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(26);
        queue.insert(30);
        queue.insert(35);
        queue.insert(40);


     //   System.out.println(queue.remove());
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
