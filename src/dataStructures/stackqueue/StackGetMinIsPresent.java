package dataStructures.stackqueue;

import java.util.Stack;

public class StackGetMinIsPresent {

    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();
    int minElement;

    public static void main(String[] args) {

        StackGetMinIsPresent stackEx = new StackGetMinIsPresent();
        stackEx.push(10);
        stackEx.push(2);
        stackEx.push(5);
        System.out.println(stackEx.getMin());
        stackEx.push(1);
        System.out.println(stackEx.getMin());
        stackEx.pop();
        stackEx.pop();
        stackEx.pop();
        stackEx.pop();
        System.out.println(stackEx.getMin());

    }

    public void push(int element){
        if (stack.isEmpty() || element<minElement){
            stack.push(element);
            minStack.push(element);
            minElement = element;
        }else {
            stack.push(element);
        }
    }

    public int getMin(){
        return minStack.peek();
    }

    public int pop(){
        int element=0;
       if (!stack.isEmpty()){
            element = stack.pop();
           if (element==minElement){
               minStack.pop();
           }
       }
       return element;
    }
}
