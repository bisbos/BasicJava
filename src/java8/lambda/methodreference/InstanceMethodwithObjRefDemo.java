package java8.lambda.methodreference;

interface MyFunc {
    boolean func (HighTemp t1,HighTemp t2);
}
public class InstanceMethodwithObjRefDemo {

    static int counter (HighTemp[] values,MyFunc myFunc,HighTemp value){
        int count =0;
        for (int i=0;i<values.length;i++){
            if (myFunc.func(values[i],value)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int count;
        HighTemp[] weekDays = {
                new HighTemp(89),new HighTemp(82),
                new HighTemp(90),new HighTemp(89),
                new HighTemp(91),new HighTemp(90),
                new HighTemp(84),new HighTemp(83)
        };

        count = counter(weekDays,HighTemp::sameTemp,new HighTemp(89));
        System.out.println(count+ " days had temperature 89");


        count = counter(weekDays,HighTemp::lessThanTemp,new HighTemp(89));
        System.out.println(count+ " days had less than temperature 89");


    }


}

class HighTemp {
    private int highTemp;

    HighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    boolean sameTemp(HighTemp ht2) {
        return highTemp == ht2.highTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return highTemp < ht2.highTemp;
    }
}
