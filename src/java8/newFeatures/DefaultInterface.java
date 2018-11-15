package java8.newFeatures;

import java.util.Collections;

public class DefaultInterface {


    public static void main(String[] args) {

        MyDefualtStaticClass testClass = new MyDefualtStaticClass();
        testClass.method1("Bisin");
        testClass.log("Bisin");
        testClass.print("bisin");
        testClass.iSNull("Bisin");
     //   MyInterface1.display();
    }


}

interface MyInterface1 {
    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);

    }

    default void print(String value){
        System.out.println("Hello My Default Method in Interface");
        if (iSNull(value)){
            System.out.println("Value is null in Interface");
        }else {
            System.out.println("Value is not null in Interface");
        }
    }

    static void display(){
        System.out.println("Hello My Static Method");
        }

    static boolean iSNull(String value)  {
        System.out.println("Hello My Static IsNull Method in Interface");
        return value==null?true:false;
    }

}

interface MyInterface2 {
    void method1(String str);

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
}

class MyDefualtStaticClass implements MyInterface1,MyInterface2 {

    @Override
    public void method1(String str) {
        System.out.println("Hello1");
    }

    @Override
    public void log(String str){
        System.out.println("Class logging::"+str);
    }

   boolean iSNull(String value)  {
       System.out.println("Hello My IsNull Method in Class");
        return value==null?true:false;
    }

}
