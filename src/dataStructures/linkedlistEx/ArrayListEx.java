package dataStructures.linkedlistEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Bisin");
        System.out.println(nameList);

        nameList.add(0,"Sunil");
        System.out.println(nameList);
    }
}
