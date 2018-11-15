package basicJava;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {

    public static void main(String[] args) {

        int value = 20;
        add(value);
        System.out.println(value);

        Integer value1 = 25;
        add(value1);
        System.out.println(value1);

        String name = "Bisin";
        changeName(name);
        System.out.println(name);

        List<String> nameList = new ArrayList<>();
        nameList.add("Bisin");
        addName1(nameList);
        nameList.stream().forEach(System.out::println);

        PBV pbv = new PBV();
        pbv.setName("Harry");
        modifyPBV(pbv);
        System.out.println(pbv.getName());

        PBV swapPBV1 = new PBV();
        swapPBV1.setName("Green");
        PBV swapPBV2 = new PBV();
        swapPBV2.setName("Blue");
        swapPBV(swapPBV1,swapPBV2);
        System.out.println(swapPBV1.getName()+" "+swapPBV2.getName());



    }

    public static void add(int value){
        value = value+10;
    }

    public static void changeName(String name){
        name = "Sunil";
    }

    public static void addName(List<String> nameList){
        nameList.add("Sunil");
    }

    public static void addName1(List<String> nameList){
        List<String> newNameList = nameList;
        newNameList.add("Ajay");
    }

    public static void modifyPBV(PBV pbv){
        PBV pbv1 = pbv;
        pbv1.setName("Tom");
    }

    public static void swapPBV(PBV pbv1,PBV pbv2){
        PBV temp = pbv1;
        pbv1= pbv2;
        pbv2 = pbv1;
    }
}

class PBV {

        String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}