package basicJava.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx {

    public static void main(String[] args) {

        Class concreteClass1 = ConcreteClass.class;
        Class concreteCLass2 = new ConcreteClass().getClass();
        try {
            Class concreteClass3 = Class.forName("basicJava.reflection.ConcreteClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class classDouble = Double.TYPE;


        System.out.println(concreteClass1);
        Class superClass = concreteClass1.getSuperclass();
        System.out.println(superClass);

    /*    Class[] classes = concreteClass1.getClasses();
        System.out.println(Arrays.toString(classes)); */

        Method[] methods = concreteClass1.getMethods();
        System.out.println(Arrays.toString(methods));

        try {
            Method method = concreteClass1.getMethod("method2", String.class);
            System.out.println(method);

            ConcreteClass concreteObj = new ConcreteClass();
            Object result = method.invoke(concreteObj,"Bisin");
            System.out.println(result);

            Method privateMethod = concreteCLass2.getDeclaredMethod("method6");
            privateMethod.setAccessible(true);
            privateMethod.invoke(concreteObj,null);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
