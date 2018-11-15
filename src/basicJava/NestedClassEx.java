package basicJava;

public class NestedClassEx {

    public static void main(String[] args) {

        MyClass outerObj = new MyClass();
        MyClass.InnerClass innerClassObj = outerObj.new InnerClass();
        innerClassObj.innerDisplay();

        MyClass.NestedClass nestedObj = new MyClass.NestedClass();
        nestedObj.nestedDisplay();
    }
}


class MyClass {

    String name = "Bisin";
    private int age = 24;
    static int salary = 1000;

    public void display(){

    /*    InnerClass innerClass = new InnerClass();
        innerClass.innerDisplay(); */
        System.out.println("Name is :"+name);
    }

    public static void greet(){
        System.out.println("Hello");
    }

    class InnerClass {

        public void innerDisplay(){
            System.out.println("Method in Inner Class");
            display();
            System.out.println("Age is :"+age);
            System.out.println("Salary is :"+MyClass.salary);
            greet();
        }
    }

    static class NestedClass {

        public void nestedDisplay(){
            System.out.println("Method in Nested Class");
            System.out.println("Salary is :"+salary);
            MyClass outerObj = new MyClass();
            outerObj.display();
            System.out.println("Age is :"+outerObj.age);
            greet();
        }
    }
}