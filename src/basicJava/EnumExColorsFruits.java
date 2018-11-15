package basicJava;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

public class EnumExColorsFruits {

    public static void main(String[] args) {

        Colors colors = Colors.RED;
        switch (colors){
            case RED:
                System.out.println("Color is red");
                break;
            default:
                System.out.println("Default Color");
        }

        Colors[] colors1 = Colors.values();
        System.out.println(Arrays.toString(colors1));

        Colors redColor = Colors.valueOf("RED");
        System.out.println(redColor);

        Fruits apple = Fruits.APPLE;
        System.out.println(apple.getPrice());

    }
}
