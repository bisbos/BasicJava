package dataStructures;

public class StackMain {

    public static void main(String[] args) {

       StackEx stackEx = new StackEx(5);
       stackEx.push(10);
       stackEx.push(15);
       stackEx.push(12);

       System.out.println("Peek Element :"+ stackEx.peek());

        stackEx.push(20);
        stackEx.push(25);
        stackEx.push(30);

       while (!stackEx.isEmpty()){
           System.out.println(stackEx.pop());
       }
    }
}
