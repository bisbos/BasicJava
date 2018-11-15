package basicJava;

public class MethodOverLoadingEx {

    public static void main(String[] args) {

        MethodOverLoadingEx methodOverLoadingEx = new MethodOverLoadingEx();
        methodOverLoadingEx.display(10);
        methodOverLoadingEx.display("Bisin");

    //    methodOverLoadingEx.display(null); compiler error - Ambigous Method call
    }

    public void display(Integer number){
        System.out.println("Number :"+number);
    }

    public void display(String value){
        System.out.println("String :"+value);
    }

    public void display(Object value){
        System.out.println("Object :"+value);
    }
}
