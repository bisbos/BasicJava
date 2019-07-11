package basicJava.classes;

import java.lang.reflect.Constructor;

public class CreateObjects {

    public static void main(String[] args) {


        CreateObjects obj1 = new CreateObjects();
        obj1.greetings();

        try {
            CreateObjects obj2 = CreateObjects.class.newInstance();
            obj2.greetings();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Class myClass = Class.forName("basicJava.classes.CreateObjects");
            CreateObjects obj3 = (CreateObjects)myClass.newInstance();
            obj3.greetings();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public void greetings(){
        System.out.println("Hello World");
    }
}
