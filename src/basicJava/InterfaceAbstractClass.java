package basicJava;

public class InterfaceAbstractClass {

    public static void main(String[] args) {

        MyInterfaceAbstractEx testEx = new MyInterfaceAbstractEx();
        testEx.display();
        testEx.printHello();
        testEx.printName();
    }
}

interface MyInterface1{

    public void display();

    default void printHello(){
        System.out.println("Hello My Interface");
    }
}

abstract class MyAbstractClass {

    public void printName(){
        System.out.println("Hello My Abstract Class");
    }

    abstract void display();

    public void printHello(){
        System.out.println("Hello My Interface - My Abstract");
    }
}

class MyInterfaceAbstractEx extends MyAbstractClass implements MyInterface1{
    public void display(){
        System.out.println("Implementation of the Abstract method display");
    }
}


