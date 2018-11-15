package dataStructures;

public class StackEx {

    int[] stack;
    int top =-1;
    int size;

    StackEx(int size){
        this.size = size;
        stack = new int[size];
    }

    public void push(int element){
        if (top==size-1){
            System.out.println("Limit of Stack reached");
        }else {
            stack[++top] = element;
        }
    }

    public int pop(){
            return stack[top--];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int peek(){
        return stack[top];
    }
}
