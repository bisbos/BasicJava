package dataStructures;

public class QueueLinkList {
    public static void main(String[] args) {

        QueueL queue = new QueueL(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.insert(30);

        queue.remove();
    }
}

class LinkListQ{
    Link first;
    Link last;

    public void insertLast(int element){
        Link newLink = new Link(element);
        if (null==last){
            first = newLink;
        }else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int deleteFirst(){
        int element = first.element;
        if (null==first.next){
            last =null;
        }
        first = first.next;
        return element;
    }

    public boolean isEmpty(){
        return first==null;
    }

}

class Link {
    Link next;
    int element;
    Link(int element){
        this.element = element;
    }
}

class QueueL{

    int[] queue;
    int size;
    int maxSize;
    LinkListQ listQ = new LinkListQ();

    QueueL(int size){
        queue = new int[size];
        this.size = size;
        maxSize=0;
    }

    public void insert(int element){
        if (maxSize==size){
            System.out.println("Queue is Full");
        }else {
            maxSize++;
            listQ.insertLast(element);
        }
    }

    public void remove(){
       while (!listQ.isEmpty()){
            System.out.println(listQ.deleteFirst());
        }
    }


}
