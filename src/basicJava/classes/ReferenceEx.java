package basicJava.classes;

public class ReferenceEx {

    int a=10;
    String name = "Bisin";

    public static void main(String[] args) {
        ReferenceEx ref1 = new ReferenceEx();
        ref1.printVariables();
        ReferenceEx ref2 = ref1;
        ref2.printVariables();
        ReferenceEx ref3 = new ReferenceEx();


        System.out.println("--------------");
        ref1.incrementNumber();
        ref1.printVariables();
        ref2.printVariables();
        ref3.printVariables();

        System.out.println(ref1==ref2);
        System.out.println(ref1.equals(ref2));

        System.out.println(ref1==ref3);
        System.out.println(ref1.equals(ref3));

    }

    public void printVariables(){
        System.out.println(a);
        System.out.println(name);
    }

    public void incrementNumber(){
        a=a+10;
    }


}
