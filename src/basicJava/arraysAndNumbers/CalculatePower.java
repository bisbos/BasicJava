package basicJava.arraysAndNumbers;

public class CalculatePower {

    public static void main(String[] args) {

        int number =3;
        int power =4;
        int result =1;
        for (int i=0;i<power;i++){
            result = result*number;
        }
        System.out.println(result);

        System.out.println(new CalculatePower().power(number,power));
    }

    public int power(int number,int power){
        if(power==0){
            return 1;
        }
        return number*power(number,power-1);
    }
}
