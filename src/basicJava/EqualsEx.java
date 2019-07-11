package basicJava;

public class EqualsEx {

    public static void main(String[] args) {
        String name = "Bisin";
        String name1 = "Bisin";
        System.out.println(name==name1);  //true

        String name2 = new String("Bisin");
        System.out.println(name1==name2); //false
        System.out.println(name1.equals(name2)); //true



        Integer number1 = 10;
        Integer number2 =10;
        System.out.println(number1==number2); //true
        Integer number3 = new Integer(10);
        System.out.println(number1==number3); //false
        System.out.println(number1.equals(number3)); //true

        Integer number4 =10;
        String number5 ="10";
     //   System.out.println(number4==number5);  // == should be applied to same type
    }
}
