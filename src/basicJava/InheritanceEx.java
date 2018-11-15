package basicJava;

import com.sun.xml.internal.rngom.parse.host.Base;

public class InheritanceEx {
    public static void main(String[] args) {

        for (int i=0;i<5;i++){
            if (i==2)
                continue;
            System.out.println(i);
        }

        BaseClass baseClass = new BaseClass(10);
        baseClass.displayColor();
        baseClass.displayHeight();
        baseClass.display();

        System.out.println("--------------------------------------");

        SubClass1 subClass1 = new SubClass1(10);
        subClass1.displayColor();
        subClass1.displayHeight();
        subClass1.display();

        System.out.println("--------------------------------------");
        BaseClass baseClass1 = new SubClass1(10);
        baseClass1.displayHeight();
        baseClass1.displayColor();
        baseClass1.display();

        ((SubClass1)baseClass1).showSubMethod();

        System.out.println("--------------------------------------");
        SubClass2 subClass2 = new SubClass2(10);
        subClass2.displayHeight();
    }
}


class BaseClass {

    int height=10;
    String color="blue";



    BaseClass(int height){
        this.height = height;
    }

    public void displayColor(){
        System.out.println("Color in Base Class :"+color);
    }

    public void displayHeight(){
        System.out.println("Height :"+height);
    }

    public static void display(){
        System.out.println("I am Static Base Class");
    }
}

class SubClass1 extends BaseClass {
    String color="red";


    SubClass1(int height){
        super(height);
    }

    @Override
    public void displayColor(){
        System.out.println("Color in Sub Class1 :"+color);
    }

    public static void display(){
        System.out.println("I am Static Sub Class1");
    }

    public void showSubMethod(){
        System.out.println("I am from Sub Class");
    }

}

class SubClass2 extends SubClass1 {
    String color="green";

    SubClass2(int height){
        super(height);
    }
    public void displayColor(){
        System.out.println("Color in Sub Class1 :"+color);
    }

    public static void display(){
        System.out.println("I am Static Sub Class1");
    }

}


