package java8.lambda.methodreference;

interface DisplayInterface {
    Hello display(String value);
}

public class MethodReferenceConstructor {

    public static void main(String[] args) {

        DisplayInterface dif = Hello::new;
        dif.display("Hello World");
    }

}

class Hello {
    public Hello (String value){
        System.out.println(value);
    }
}
