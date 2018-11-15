package dataStructures;

public class QueueEx {

    int[] queue;
    int front;
    int rear;
    int size;

    QueueEx(int size){
        queue = new int[size];
        front =0;
        rear = 0;
        this.size = size;
    }

    public void insert(int element){
        if (rear==size){
            System.out.println("Queue is Full");
        }else {
            queue[rear++] = element;

        }
    }

    public int remove(){
        return queue[front++];
    }

    public boolean isEmpty(){
        return front==rear;
    }


}
