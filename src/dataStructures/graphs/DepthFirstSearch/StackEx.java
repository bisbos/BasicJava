package dataStructures.graphs.DepthFirstSearch;

public class StackEx {

    int[] stack;
    int top =-1;

    StackEx(int MAX_VERTS){
        stack = new int[MAX_VERTS];
    }

    public void push(int element){
        stack[++top] = element;
    }

    public int pop(){
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
}


